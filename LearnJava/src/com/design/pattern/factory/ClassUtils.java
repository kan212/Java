package com.design.pattern.factory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {

	/**
	 * 给一个接口，返回这个接口的所有实现类
	 * @param c
	 * @return
	 */
	public static List<Class> getAllClassByInterface(Class c) {
		
		List<Class> returnList = new ArrayList<Class>();
		if(c.isInterface()) {
			String packageName = c.getPackage().getName();
			try {
				List<Class> list = getClass(packageName);
				for (int i = 0; i < list.size(); i++) {
					if(c.isAssignableFrom(list.get(i))) {
						if(!c.equals(list.get(i))) {
							returnList.add(list.get(i));
						}
					}
				}
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return returnList;
	}
	
	/**
	 * 从一个包中查找所有类，不包含jar
	 * @param packageName
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static List<Class> getClass(String packageName) throws IOException, ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path = packageName.replace(".", "/");
		Enumeration<URL> enumeration = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (enumeration.hasMoreElements()) {
			URL url = (URL) enumeration.nextElement();
			dirs.add(new File(url.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File dir : dirs) {
			classes.addAll(findClass(dir,packageName));
		}
		return classes;
	}

	/**
	 * 返回类列表
	 * @param dir
	 * @param packageName
	 * @return
	 * @throws ClassNotFoundException
	 */
	private static List<Class> findClass(File dir, String packageName) throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if(!dir.exists()) {
			return classes;
		}
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClass(file, packageName + "." + file.getName()));
			}else if(file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}
	
}

package com.design.pattern.singleton;

public class Emperor {

	private static Emperor emperor = null; 
	
	public Emperor() {
		
	}
	
	/**
	 * 非线程安全的
	 * @return
	 */
	public static Emperor getInstance() {
		if(null == emperor) {
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public void emperorInfo(){
		System.out.println("单例模式"); 
	}
	
}

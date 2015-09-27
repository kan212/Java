package com.design.pattern.multition;

import java.util.ArrayList;
import java.util.Random;

public class Multition {

	public static int maxNum = 2;
	private static ArrayList multitionInfo = new ArrayList(maxNum);
	private static ArrayList<Multition> multition = new ArrayList<Multition>(maxNum);

	private static int current = 0;
	
	static {
		for (int i = 0; i < maxNum; i++) {
			multition.add(new Multition("第" + i+ "个对象"));
		}
	}
	
	public Multition(String info) {
		multitionInfo.add(info);
	}
	
	public static Multition getInstance() {
		Random random = new  Random();
		current = random.nextInt(maxNum);
		return multition.get(current);
	}
	
	public void out() {
		System.out.println(multitionInfo.get(current));
	}
	
}

package com.design.pattern.multition;

/**
 * 多例模式
 * 
 * @author kan212 
 * 其实就是有上限的单例模式
 *
 *
 */
public class Pattern {

	public static void main(String[] args) {
		int num  = 10;
		for (int i = 0; i < num; i++) {
			Multition multition = Multition.getInstance();
			multition.out();
		}
	}
	
}

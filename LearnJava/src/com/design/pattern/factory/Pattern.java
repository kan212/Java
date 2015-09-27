package com.design.pattern.factory;

/**
 * 工厂模式
 * @author kan212
 *
 */
public class Pattern {

	public static void main(String[] args) {
		Human man = Factory.createHuman(Man.class);
		man.cry();
		man.lanch();
		for (int i = 0; i < 2; i++) {
			Human human = Factory.createHuman();
			human.cry();
			human.talk();
		}
	}
	
}

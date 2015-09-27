package com.design.pattern.singleton;

/**
 * 单例模式
 * 
 * @author kan212
 *
 */
public class SingletonPattern {

	public static void main(String[] args) {
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo();
		// 第二天
		Emperor emperor2 = Emperor.getInstance();
		emperor2.emperorInfo();
		// 第三天
		Emperor emperor3 = Emperor.getInstance();
		emperor2.emperorInfo();

	}

}

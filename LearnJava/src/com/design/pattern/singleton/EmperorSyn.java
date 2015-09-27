package com.design.pattern.singleton;

/**
 * 线程安全的单例模式
 * 
 * @author kan212
 *
 */
public class EmperorSyn {

	private static EmperorSyn emperorSyn = new EmperorSyn();

	// 限制住不能直接产生一个实例
	public synchronized static EmperorSyn getInstance() {
		return emperorSyn;
	}

}

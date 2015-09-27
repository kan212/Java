package com.design.pattern.strategy;

/**
 * 策略模式
 * @author kan212
 * 高内聚低耦合的特性
 * 核心点： 接口定义，子类实现接口的实现
 *
 */
public class StrategyPattern {

	public static void main(String[] args) {
		First first = new First();
		Pattern pattern = new Pattern(first);
		pattern.operate();
	}
	
}

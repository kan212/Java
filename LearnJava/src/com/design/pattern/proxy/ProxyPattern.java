package com.design.pattern.proxy;

/**
 * 
 * 代理模式
 * @author kan212
 * 利用的是JAVA的多态，只要是集成同一个接口的，都可以有一个类来统一管理
 *
 */
public class ProxyPattern {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.see();
		proxy.make();
	}
	
}

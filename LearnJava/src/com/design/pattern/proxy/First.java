package com.design.pattern.proxy;

public class First implements Kind{

	@Override
	public void make() {
		System.out.println("first make");
	}

	@Override
	public void see() {
		System.out.println("first see");
	}

}

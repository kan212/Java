package com.design.pattern.factory;

public class Man implements Human{

	@Override
	public void cry() {
		System.out.println("man cry");
	}

	@Override
	public void talk() {
		System.out.println("man talk");
	}

	@Override
	public void lanch() {
		System.out.println("man lanch");
	}

}

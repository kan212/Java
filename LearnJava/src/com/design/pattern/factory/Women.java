package com.design.pattern.factory;

public class Women implements Human{

	@Override
	public void cry() {
		System.out.println("Women cry");
	}

	@Override
	public void talk() {
		System.out.println("Women talk");
	}

	@Override
	public void lanch() {
		System.out.println("Women lanch");
	}

}

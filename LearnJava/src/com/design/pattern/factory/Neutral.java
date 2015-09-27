package com.design.pattern.factory;

public class Neutral implements Human{

	@Override
	public void cry() {
		System.out.println("Neutral cry");
	}

	@Override
	public void talk() {
		System.out.println("Neutral talk");
	}

	@Override
	public void lanch() {
		System.out.println("Neutral lanch");
	}

}

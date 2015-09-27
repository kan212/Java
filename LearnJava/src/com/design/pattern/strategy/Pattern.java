package com.design.pattern.strategy;

public class Pattern {

	private Istrateg mIstrateg;
	
	public Pattern(Istrateg istrateg) {
		this.mIstrateg = istrateg;
	}
	
	public void operate() {
		this.mIstrateg.operate();
	}
	
}

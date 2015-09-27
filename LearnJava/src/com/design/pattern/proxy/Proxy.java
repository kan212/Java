package com.design.pattern.proxy;

/**
 * 代理者
 * @author kan212
 *
 */
public class Proxy implements Kind{

	private Kind mKind;
	
	public Proxy() {
		mKind = new First();
	}
	
	public Proxy(Kind kind) {
		this.mKind = kind;
	}
	
	@Override
	public void make() {
		mKind.make();
	}

	@Override
	public void see() {
		mKind.see();
	}

}

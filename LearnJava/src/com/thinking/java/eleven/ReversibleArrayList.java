package com.thinking.java.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T>{

	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	
	/**
	 * 反向迭代器
	 * @return
	 */
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			int current = size() -1;
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
}

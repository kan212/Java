package com.cache;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Hashtable;

/**
 * 用弱引用构建的java高速缓存
 * @author kan212
 *
 */
public class SoftCache {

	private static SoftCache cache;
	private Hashtable<String, SoftCache> softRefs;
	private ReferenceQueue<SoftItme> queue;
	
	private class SoftRef extends SoftReference<SoftItme> {
        private  String  _key  =  "" ;
		public SoftRef(SoftItme referent, ReferenceQueue<? super SoftItme> q) {
			super(referent, q);
			_key = referent.getId();
		}
	}
	
	
	
	
	public class SoftItme {
		 String id;
		public String getId() {
			return id;
		}
	}
	
}

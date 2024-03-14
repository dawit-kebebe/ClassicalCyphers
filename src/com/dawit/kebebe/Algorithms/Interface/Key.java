package com.dawit.kebebe.Algorithms.Interface;

public class Key<KT> {
	private KT key;
	
	public Key() {
		
	}
	
	public Key(KT key) {
		this.key = key;
	}
	
	public void setKey(KT key) {
		this.key = key;
	}
	
	public KT getKey() {
		return this.key;
	}
}

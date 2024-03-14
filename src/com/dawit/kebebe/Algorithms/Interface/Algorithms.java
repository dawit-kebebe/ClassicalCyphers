package com.dawit.kebebe.Algorithms.Interface;

public interface Algorithms {
	public String decrypt(String msg, Key<?> key);
	public String encrypt(String msg, Key<?> key);
}

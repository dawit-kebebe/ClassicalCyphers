package com.dawit.kebebe.Algorithms;

import com.dawit.kebebe.Algorithms.Interface.Algorithms;
import com.dawit.kebebe.Algorithms.Interface.Alphabets;
import com.dawit.kebebe.Algorithms.Interface.Key;

public class Vigenere implements Algorithms {

	String wheel = Alphabets.getAmharicAlphabet();
	int wheelLen = Alphabets.ALPHABET_LEN;
	
	@Override
	public String decrypt(String msg, Key<?> key) {
		// TODO Auto-generated method stub
		StringBuilder plainTxt = new StringBuilder();
		
		int keyStream[] = (int[]) key.getKey();
		int keyLength = keyStream.length;
		
		if (msg.length() < keyLength) {
			return "Invalid key";
		}else if(msg.length() > keyLength) {
			keyStream = new int[msg.length()];
			
			for(int i = 0; i < msg.length(); i++) {
				keyStream[i] = ((int[]) key.getKey())[i % keyLength];
			}
		}
		
		for(int i = 0; i < msg.length(); i++) {
			int cypherPos = wheel.indexOf(msg.charAt(i));
			int plainPos = cypherPos - keyStream[i] % wheelLen;
			
			plainTxt.append(wheel.charAt(plainPos));
		}
		
		
		return plainTxt.toString();
	}

	@Override
	public String encrypt(String msg, Key<?> key) {
		// TODO Auto-generated method stub
		StringBuilder cypherTxt = new StringBuilder();
		
		int keyStream[] = (int[]) key.getKey();
		int keyLength = keyStream.length;
		
		if (msg.length() < keyLength) {
			return "Invalid key";
		}else if(msg.length() > keyLength) {
			keyStream = new int[msg.length()];
			
			for(int i = 0; i < msg.length(); i++) {
				keyStream[i] = ((int[]) key.getKey())[i % keyLength];
			}
		}
		
		for (int i = 0; i < msg.length(); i++) {
			int plainPos = wheel.indexOf(msg.charAt(i));
			int cypherPos = (plainPos + keyStream[i]) % wheelLen;
			
			cypherTxt.append(wheel.charAt(cypherPos));
		}
		
		
		
		return cypherTxt.toString();
	}
	
}

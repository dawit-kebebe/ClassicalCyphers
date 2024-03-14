package com.dawit.kebebe.Algorithms;

import com.dawit.kebebe.Algorithms.Interface.*;

public class Caesar implements Algorithms {

	String wheel = Alphabets.getAmharicAlphabet();
	int wheelLen = Alphabets.ALPHABET_LEN;
	
	@Override
	public String decrypt(String msg, Key<?> key) {
		// TODO Auto-generated method stub
		StringBuilder plainTxt = new StringBuilder();
		int keyNo = (int) key.getKey();
		
		for (int i = 0; i < msg.length(); i++) {
			int cypherPos = wheel.indexOf(msg.charAt(i));
			int plainPos = (cypherPos - keyNo)  % wheelLen;
			
			plainTxt.append(wheel.charAt(plainPos));
		}
		
		return plainTxt.toString();
	}

	@Override
	public String encrypt(String msg, Key<?> key) {
		// TODO Auto-generated method stub
		StringBuilder cypherTxt = new StringBuilder();
		int keyNo = (int) key.getKey();
		
		for (int i = 0; i < msg.length(); i++) {
			int plainPos = wheel.indexOf(msg.charAt(i));
			int cypherPos = (plainPos + keyNo)  % wheelLen;
			
			cypherTxt.append(wheel.charAt(cypherPos));
			System.out.println(plainPos + "," + cypherPos);
		}
		
		return cypherTxt.toString();
	}
	
}

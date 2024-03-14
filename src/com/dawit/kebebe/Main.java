package com.dawit.kebebe;

import java.util.*;

import com.dawit.kebebe.Algorithms.Caesar;
import com.dawit.kebebe.Algorithms.Vigenere;
import com.dawit.kebebe.Algorithms.Interface.Algorithms;
import com.dawit.kebebe.Algorithms.Interface.Key;

public class Main {

	public static void main(String[] args) {
		Algorithms algorithm = null;
		int algorithmOption = 1, operationOption = 1;
		String keyStr = "";
		String message = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("| Welcome to our program!");
			System.out.println("| Choose algorithm: ");
			System.out.println("| 1. Caesar");
			System.out.println("| 2. Vegnere");
			System.out.println("--------------------------");
			System.out.print(">>> ");
			algorithmOption = sc.nextInt();
			System.out.print("Enter your msg: ");
			message = sc.nextLine();
			System.out.print("Enter your key: ");
			keyStr = sc.nextLine();
			
			System.out.println("--------------------------");
			System.out.println("| Choose operation: ");
			System.out.println("| 1. Encryption");
			System.out.println("| 2. Decryption");
			System.out.println("--------------------------");
			System.out.print(">>> ");
			operationOption = sc.nextInt();
			int keyArr[] = parseStr(keyStr);
			
			switch(algorithmOption) {
			case 1:
				algorithm = new Caesar();
				Key<Integer> keyObj = new Key<Integer>(keyArr[0]);
				System.out.println(
						(operationOption == 1) ? "Cypher Text: " + algorithm.encrypt(message, keyObj) : "Plain Text: " + algorithm.decrypt(message, keyObj)
				);
				break;
			case 2:
				algorithm = new Vigenere();
				Key<int[]> keyObjV = new Key<int[]>(keyArr);
				System.out.println(
						(operationOption == 1) ? "Cypher Text: " + algorithm.encrypt(message, keyObjV) : "Plain Text: " + algorithm.decrypt(message, keyObjV)
				);
				break;
			default: 
				System.out.println("Invalid algorithm choice. ");
				continue;
			}
		}
	}
	
	private static int[] parseStr(String key) {
		String[] keyStream = key.split(",");
		int[] keyStreamInt = new int[keyStream.length];
		
		try {
			for (int i = 0; i < keyStream.length; i++) {
				keyStreamInt[i] = Integer.parseInt(keyStream[i]);
			}
		}catch(Exception ex) {
			System.err.println("Invalid key: " + ex.getMessage());
			System.exit(-1);
		}
		
		return keyStreamInt;
	}

}

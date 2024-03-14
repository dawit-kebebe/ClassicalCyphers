package com.dawit.kebebe.Algorithms.Interface;

public class Alphabets {
	public static int ALPHABET_LEN = 238;
	public static String getAmharicAlphabet() {
		char letter[][] = new char[34][7];
		StringBuilder letters = new StringBuilder();
		
		letter[0][0] = 'ሀ';
		letter[1][0] = 'ለ';
		letter[2][0] = 'ሐ';
		letter[3][0] = 'መ';
		letter[4][0] = 'ሠ';
		letter[5][0] = 'ረ';
		letter[6][0] = 'ሰ';
		letter[7][0] = 'ሸ';
		letter[8][0] = 'ቀ';
		letter[9][0] = 'በ';
		letter[10][0] = 'ቨ';
		letter[11][0] = 'ተ';
		letter[12][0] = 'ቸ';
		letter[13][0] = 'ኀ';
		letter[14][0] = 'ነ';
		letter[15][0] = 'ኘ';
		letter[16][0] = 'አ';
		letter[17][0] = 'ከ';
		letter[18][0] = 'ኸ';
		letter[19][0] = 'ወ';
		letter[20][0] = 'ዐ';
		letter[21][0] = 'ዘ';
		letter[22][0] = 'ዠ';
		letter[23][0] = 'የ';
		letter[24][0] = 'ደ';
		letter[25][0] = 'ጀ';
		letter[26][0] = 'ገ';
		letter[27][0] = 'ጠ';
		letter[28][0] = 'ጨ';
		letter[29][0] = 'ጰ';
		letter[30][0] = 'ጸ';
		letter[31][0] = 'ፀ';
		letter[32][0] = 'ፈ';
		letter[33][0] = 'ፐ';
		
		for (int j = 0; j < 34; j++) {
			for (int i = 0; i < 7; i++) {
				letter[j][i] = (char) (((int) letter[j][0]) + i);
				letters.append(letter[j][i]);
			}
		}	
		
		return letters.toString();
	}
}

package com.dawit.kebebe;

public class test {
	// TODO Auto-generated method stub
			//251 Amharic characters
			
//			byte x = (byte) 0xE1;
//			byte y = (byte) 0x88;
//			byte z = (byte) 0x80;
//			byte[] x = new byte[3];
//			x[0] = 0;
//			Scanner scanner = new Scanner(System.in);
//			
//			try {
//				System.out.println("Something");
//				x[0] = scanner.nextByte();
//				DataInputStream in = new DataInputStream(System.in);
//				System.out.println("Something");
//				while (true) {
//					if (x[0] != 0) {
//						System.out.println("broken");
//						break;
//					}
//					in.read(x);
//				}
//				
//				System.out.write(x);
//				System.out.println(x[0]+ "," + x[1] +","+x[2]);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				System.out.print(e.getMessage());
//			}
//			File file = new File("./", "test.txt");
//			try {
//				if (!file.exists() && !file.createNewFile()) {
//					System.out.println("File Cannot be created.");
//					System.exit(1);
//				}
//				
//				int initX = 0xE1;
//				int initY = 0x88;
//				int initZ = 0x80;
//				
//				AmharicChar amChar[] = new AmharicChar[383];
//				
//				for (int i = 0; i < amChar.length; i++) {
//					if (initZ >= 0xC0) {
//						initZ = 0x80;
//						initY += 1;
//						
//						byte tmpX = (byte)initX;
//						byte tmpY = (byte)initY;
//						byte tmpZ = (byte)initZ;
//						amChar[i] = new AmharicChar(tmpX, tmpY, tmpZ);
//						
//						initZ += 1;
//					}else {
//						byte tmpX = (byte)initX;
//						byte tmpY = (byte)initY;
//						byte tmpZ = (byte)initZ;
//						amChar[i] = new AmharicChar(tmpX, tmpY, tmpZ);
//						
//						initZ += 1;
//					}
//				}
//				
//				FileOutputStream fileOut = new FileOutputStream(file);
//				System.out.println(amChar.length);
//				for (int i = 0; i < amChar.length; i++) {
//					System.out.write(amChar[i].getChar());
//					fileOut.write(amChar[i].getChar());
//				}
//				
//				fileOut.close();
//			}catch(Exception ex) {
//				System.out.println(ex.getMessage());
//			}
	
	static class AmharicChar {
		private byte [] amharicChar;
		
//		public AmharicChar() {}
		
		public AmharicChar(byte b1, byte b2, byte b3) {
			amharicChar = new byte[3];
			amharicChar[0] = b1;
			amharicChar[1] = b2;
			amharicChar[2] = b3;
		}
		
		public byte[] getChar() { return this.amharicChar; }
		
		public void setChar(byte b1, byte b2, byte b3) {
			amharicChar = new byte[3];
			amharicChar[0] = b1;
			amharicChar[1] = b2;
			amharicChar[2] = b3;
		}
	}
}

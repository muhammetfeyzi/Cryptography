package crypto.com;

import java.util.Scanner;

public class affineCipher {
	static String decrypt="";
	static char asciCharacterToNumber [] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// linear olarak d�z metnin �ifrelenmesi 
		// mant���yla �al���r.
		// y = ax+b y 
		// y = �ifreli metin
		// x= d�z metin 
		// b = anahtar . . .
		// test edilmi�tir. . . 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("affine sifreleme y=ax+b a,b anahtar olarak verilir.. . . ");
		String plainText= "baba dede";
		System.out.println("l�tfen anahtar�n a de�erini giriniz");
		int keyA=scan.nextInt();
		System.out.println("l�tfen anahtar�n b de�erini giriniz");
		int keyB =scan.nextInt();
		System.out.println(decryptPlaintextAffine(keyA,keyB,plainText.toUpperCase()));
		/*
		String[] a = key.split("\\D");
		System.out.println("split yaz�l�yor");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		
	}

	private static String decryptPlaintextAffine(int keyA, int keyB,
			String plainText) {
		
		// TODO Auto-generated method stub
		char plainTextChar[]= plainText.toCharArray();
		/*for (int i = 0; i < plainTextChar.length; i++) {
			 asciCharacterToNumber[i]=(char) (plainTextChar[i]%65);
		}*/
		for (int i = 0; i < plainTextChar.length; i++) {
			 plainTextChar[i] = (char) (((((plainTextChar[i]%64)*keyA))+keyB)+64); 
			 if(((int) plainTextChar[i]) >=90){
				 plainTextChar[i] = (char) ((plainTextChar[i]%90)+65);
			 }
			 decrypt =decrypt+plainTextChar[i];
		}
		return decrypt.toLowerCase();
	}

}

package crypto.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sezarDecryption {
	// Dosyadan okunan bir metnin julias sezar 
	//decrypt algoritmasýna göre þifrelenmesi yapýlacaktýr.
	static String dcryptText ="";
	static String readText="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Charcterlerin yazýlmasý ");
		// String alphabet="abcdefghýijklmnoprstuvyzx";
		// String upperAlphabet="ABCDEFGHIÝJKLMNOPRSTUVYZX";
		// bildiðimiz þey þu ki 65-88 arasý küçük harfler
		// 97-120 arasý büyük harflerin ascii karþýlýklarý.
		String PlainText = readData();
		decryptionText(PlainText, 2);
		System.out.println(dcryptText);
	}

	private static String readData() {
		String st="";
		// TODO Auto-generated method stub
		File file = new File("C:\\sezar.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Text Dosyasý okunuyor.");
		
		try {
			while ((st = br.readLine()) != null) {
				readText = readText+st;
				readText = readText+"\n";
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(readText);
		return readText;
	}

	private static String decryptionText(String alphabet, int anahtar) {
		// TODO Auto-generated method stub
		alphabet = alphabet.toUpperCase();
		char plainText[] = alphabet.toCharArray();

		for (int i = 0; i < plainText.length; i++) {

			if ((int) plainText[i] >= 65 & (int) plainText[i] < 90) {
				// harflerin ascii karakteri bu aralýkta olur.
				plainText[i] = (char) (plainText[i] + anahtar);
				if (plainText[i] >= 90) {
					plainText[i] = (char) ((plainText[i] % 90) + 65);
				}

			}
			dcryptText = (dcryptText + plainText[i]).toLowerCase();
		}
		return dcryptText;
	}

	

	


}

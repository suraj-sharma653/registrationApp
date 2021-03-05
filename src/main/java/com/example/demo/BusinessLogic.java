package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
	public String encryptText(String str) {

		char[] emb = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (((int) emb[i] > 64) && ((int) emb[i] > 91)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp + str.length()) % 26;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
			if (((int) emb[i] > 47) && ((int) emb[i] < 58)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp + str.length()) % 10;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
			if (((int) emb[i] > 96) && ((int) emb[i] < 123)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp + str.length()) % 26;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
		}
		str = new String(emb);
		return str;
	}

	public String decryptText(String str) 
	{
		char[] emb = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (((int) emb[i] > 64) && ((int) emb[i] > 91)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp - str.length()) % 26;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
			if (((int) emb[i] > 47) && ((int) emb[i] < 58)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp - str.length()) % 10;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
			if (((int) emb[i] > 96) && ((int) emb[i] < 123)) {
				int tmp = emb[i] - 'A';
				int rotated = (tmp - str.length()) % 26;
				int shift = rotated + 'A';
				emb[i] = (char) shift;
			}
		}
		str = new String(emb);
		return str;
	}

}

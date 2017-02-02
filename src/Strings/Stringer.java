package Strings;

import java.util.Arrays;

public class Stringer {

	private String myString;

	public Stringer(String s) {
		myString = s.toLowerCase(); //change to lowercase

	}

	public void printString() {
		System.out.println(myString);
	}

	public void listStringChars() {
		StringBuilder sentence = new StringBuilder();
		char[] txtArray = myString.toCharArray();

		String firstChar1 = String.valueOf(txtArray[0]).toUpperCase();
		sentence.append(firstChar1);

		if (myString.length() > -1) {
			for (int i = 1; i < myString.length(); i++) {
				String firstChar = String.valueOf(txtArray[i]).toUpperCase();

				char[] chars = new char[i];
				Arrays.fill(chars, txtArray[i]);
				sentence.append("-").append(firstChar)
						.append(String.valueOf(chars));
			}
			System.out.println(sentence.toString());
		}
	}

}

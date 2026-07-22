package IEEE_CS.Level_A;

import java.util.Scanner;

public class WayTooLongWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		byte nTestCases = s.nextByte();
		
		
		for(byte i = 0; i < nTestCases; ++i) {
			String word = s.next();
			String converted = convert(word);
			if(converted != null) {
				System.out.println(converted);
			} else {
				System.out.println(word);
			}
		}
	}
	static String convert(String word) {
		if(word.length() > 10) {
			return  "" + word.charAt(0) + "" + (word.length()-2) + ""+ word.charAt(word.length() - 1);
		}
		return null;
	}
}

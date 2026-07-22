package IEEE_CS.Level_A;

import java.util.Scanner;

public class cAPSLOCK {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next();
		
		boolean change = true;
		
		for(int i = 1; i < word.length(); ++i) {
			if(isSmall(word.charAt(i))) {
				change = false;
			}
		}
		
		char[] newWordArr;
		String newWord;
		// change the word
		if(change) {

			newWordArr = new char[word.length()];

			for(int i = 0; i < word.length(); ++i) {
				// switch letter case
				if(isSmall(word.charAt(i))) {
					newWordArr[i] = (char) (word.charAt(i) - 32);
				} else {
					newWordArr[i] = (char) (word.charAt(i) + 32);
				}
			}
			
			newWord = String.valueOf(newWordArr);
			System.out.println(newWord);
		} else {
			System.out.println(word);
		}
		
	
	}
	static boolean isSmall(char letter) {
		if(letter >= (char) 97) {
			return true;
		} else {
			return false;
		}
	}

}

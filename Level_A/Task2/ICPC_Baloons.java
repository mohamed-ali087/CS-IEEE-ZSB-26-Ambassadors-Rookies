package IEEE_CS.Level_A;

import java.util.Scanner;

public class ICPC_Baloons {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		byte t = s.nextByte();
		
		byte[] nProblemsArr = new byte[t];
		
		byte nProblems = 0;
		
		for(byte i = 0; i < t; ++i) {

			// string length
			byte strLength = s.nextByte();

			// string that contain problems letters
			String letters = s.next();

			// array that store the letters that are solved
			char[] lettersSolved = new char[strLength];

			// n of letters solved
			byte n = 0;

			// team points
			byte p = 0;


			// iterate through line letters
			for(byte j = 0; j < strLength; ++j) {
				char letter = letters.charAt(j);

				if(!(isInArray(lettersSolved, letter) ) ) {
					lettersSolved[n++] = letter;
					p += 2;
				} else {
					p++;
				}
			}
			
			nProblemsArr[nProblems++] = p;
		}
		
		// print the output
		for(byte i = 0; i < t; ++i) {
			System.out.println(nProblemsArr[i]);
		}
		
	}
	
	static boolean isInArray(char[] array, char value){
		
		for(char element : array) {
			if(element == value) {
				return true;
			}
		}

		return false;
	}

}

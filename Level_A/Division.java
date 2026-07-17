package Level_A;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		short n = s.nextShort();
		
		short[] iArray = new short[n];
		
		for(short i = 0; i < n; ++i) {
			iArray[i] = s.nextShort();
		}
		
		for(short i = 0; i < n; ++i) {
			if(iArray[i] <= 1399) {
				System.out.println("Division 4");
			} else if(iArray[i] >= 1900) {
				System.out.println("Division 1");
			} else if(iArray[i] >= 1400 && iArray[i] <= 1599) {
				System.out.println("Division 3");
			} else if(iArray[i] >= 1600 && iArray[i] <= 1899) {
				System.out.println("Division 2");
			} 

		}
		
	
		
	}
}

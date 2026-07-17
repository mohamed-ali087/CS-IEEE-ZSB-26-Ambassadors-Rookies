package Level_A;

import java.util.Scanner;


public class BuyShovel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		short price = s.nextShort();
		
		byte r = s.nextByte();
				
		short nOfShovels = 0;
		
		int totalprice = 0;
		
		/*
		 * corner case price is lower than 10
		 * Done
		 */
		
		do {
			totalprice += (int) price;
			nOfShovels++;
		} while(totalprice%10 != (int) r && totalprice % 10 != 0);
		
		System.out.println(nOfShovels);
	}
}

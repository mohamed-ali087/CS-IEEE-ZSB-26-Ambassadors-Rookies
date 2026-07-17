package IEEE_CS.Level_A;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		short n = s.nextShort();
		
		short nSol = 0;

		for(short i = 0; i < n; ++i) {
			int nOfTrue = 0;
			for(byte j = 0; j < 3; ++j) {

				if(s.nextByte() <= 0) {
					continue;
				} else {
					nOfTrue++;
				}

				
			}
			if(nOfTrue >= 2) {
				nSol++;
			}
		}
		
		System.out.println(nSol);
		
	}

}

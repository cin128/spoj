package spoj.pot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short n = s.nextShort();
		for(int i=0; i<n; i++) {
			String a = s.next();
			String b = s.next();
			Integer result = pot(a, b);
			System.out.println(result);
		}
		s.close();		
	}

	private static Integer pot(String a, String b) {
		Integer bl = b.length();
		Integer a1 = Integer.parseInt(a.substring(a.length()-1));
		Integer b2 = Integer.parseInt(b.substring(bl-(bl>1?2:1)));
		if(b2==0) {
			return 1;
		}
		switch(a1) {
			case 0:
			case 1:
			case 5:
			case 6:
				return a1;
			case 2:
				switch(b2 % 4) {
					case 0:
						return 6;
					case 1:
						return 2;
					case 2:
						return 4;
					case 3:
						return 8;
				}
			case 4:
				switch(b2 % 2) {
				case 0:
					return 6;
				case 1:
					return 4;
				}
			case 8:
				switch(b2 % 4) {
					case 0:
						return 6;
					case 1:
						return 8;
					case 2:
						return 4;
					case 3:
						return 2;
				}
			case 3:
				switch(b2 % 4) {
					case 0:
						return 1;
					case 1:
						return 3;
					case 2:
						return 9;
					case 3:
						return 7;
				}
			case 9:
				switch(b2 % 2) {
					case 0:
						return 1;
					case 1:
						return 9;					
				}
			case 7:
				switch(b2 % 4) {
					case 0:
						return 1;
					case 1:
						return 7;
					case 2:
						return 9;
					case 3:
						return 3;
				}
				
		}
		return 1;		
	}
}

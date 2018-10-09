package spoj.id617.StringMerge;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		for(int i=0; i<l; i++){
			String a = s.next();
			String b = s.next();
			int size = a.length()>b.length()?b.length():a.length();

			StringBuilder sb = new StringBuilder(size*2);
			for(int j=0; j<size; j++){
				sb.append(a.charAt(j));
				sb.append(b.charAt(j));
			}

			System.out.println(sb.toString());
		}
	}
}

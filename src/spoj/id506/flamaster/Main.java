package spoj.id506.flamaster;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0; i<n; i++){
			String l = s.next();
			String res = flamaster(l);
			System.out.println(res);
		}
	}

	private static String flamaster(String l) {
		StringBuilder sb = new StringBuilder();
		Character last = null;
		int count = 0;
		for(int i=0; i<l.length(); i++){
			Character c = l.charAt(i);
			if(last==null){
				last = c;
			} else if(!last.equals(c)){
				append(sb, last, count);
				count=0;
				last = c;
			}
			count++;
		}
		append(sb, last, count);
		return sb.toString();
	}

	private static void append(StringBuilder sb, Character last, int count) {
		sb.append(last);
		if(count>2){
			sb.append(count);
		} else if(count==2){
			sb.append(last);
		}
	}
}

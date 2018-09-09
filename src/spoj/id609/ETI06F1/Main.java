package spoj.id609.ETI06F1;

import java.util.Scanner;

public class Main {
	private static double PI = 3.141592654;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextFloat();
		double d = s.nextFloat();		
		double result=PI*(r*r-(d*d/4.0));
		System.out.println(result);
		s.close();		
	}
}

package spoj.id626.GLUTTON;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private final static int DOBA = 24*60*60;
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		for(int i=0; i<l; i++){
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			int c = 0;
			int p = 0;
			for(int j=0; j<n; j++){
				int k = Integer.parseInt(br.readLine());
				c+= DOBA/k;
			}
			p+=c/m;
			c=c%m;
			if(c>0){
				p++;
			}
			System.out.println(p);
		}
	}
}

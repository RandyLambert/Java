package pta;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class stringpaixu {
	public static void main(String []args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		String []a = new String[x];
		for(int i = 0;i < x;i++) {
			a[i] = sc.next();
		}
		
		Arrays.sort(a);
		for(String b : a) {
			System.out.println(b);
		}
		

	}
}

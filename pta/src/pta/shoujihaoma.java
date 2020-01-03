package pta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shoujihaoma {
	public static void main(String []args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+b);
				break;
			}
			catch(InputMismatchException e){
				sc.nextLine();

			}
			
			
		}
		
		
		
		
		
	}
}

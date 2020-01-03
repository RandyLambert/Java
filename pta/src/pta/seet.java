package pta;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class seet {
	public static void main(String []args) {
		Set<String> set = new TreeSet<String>();
		String a;
		Scanner sc = new Scanner(System.in);
		while(true) {
			a = sc.nextLine();
			if(a.compareTo("end")==0) {
				break;
			}
			else {
				set.add(a);
			}
		}
		while(true) {
			a = sc.nextLine();
			if(a.compareTo("end")==0) {
				break;
			}
			else {
				set.add(a);
			}
		}
		for(String x: set) {
			System.out.println(x);
		}
	}
	
}

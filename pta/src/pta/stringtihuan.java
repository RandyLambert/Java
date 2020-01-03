package pta;
import java.util.Scanner;
import java.util.*;
public class stringtihuan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int len = 0;
		String s;
		while(true) {
			s = sc.nextLine();
			if(s.compareTo("end") == 0) {
				break;
			}
			else {
				len++;
				arr.add(s);
			}
		}
		String a = sc.next();
		String b = sc.next();
		
		for(int i = 0;i<len;i++) {
			s = arr.get(i).replace(a, b);
			System.out.println(s);
		}
	}
}

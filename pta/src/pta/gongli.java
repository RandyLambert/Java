package pta;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class gongli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a;
		a = sc.nextLong();
		char []b = {1,22,23,4,5,6,7,8,9,0};
	//	Calendar b = Calender.getlnstance();
		//b.setTimeInMillis(a);
		//System.out.print(b.get(Calendar.YEAR)+"-"+b.get(Calendar.HOUR));
		Arrays.sort(b,0,10);
		for(int x:b) {
			System.out.println(x);
		}
	}
}

package pta;

import java.util.HashMap;
import java.util.Scanner;

public class match {

	public static void main(String []args) {
		HashMap<String,String> mp = new HashMap<String,String>();
		mp.put("Australian","Spain");
		mp.put("Holland","Chile");
		mp.put("Chile","Holland");
		mp.put("Spain","Australian");
		mp.put("Cameroon","Brazil");
		mp.put("Brazil","Cameroon");
		mp.put("Croatia","Mexico");
		mp.put("Mexico","Croatia");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(mp.containsKey(a)) {
			System.out.print(a+" team's rival is "+mp.get(a)+".\n");
		}
		else {
			System.out.print(a+"'s team has no match today"+".\n");
		}
	}
}

package pta;
import java.math.*;
import java.util.*;
public class jiusanqi {

	public static void main(String []args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		String []ob = str.split("\\D",0);
		if(str.indexOf('/')!=-1) {
			BigInteger a = new BigInteger(ob[0]);
			BigInteger b = new BigInteger(ob[1]);
			a = a.divide(b);
			a = a.subtract(b);
		}
		
			
	}
}

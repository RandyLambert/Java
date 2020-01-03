package chengji;

import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class factorial {
	public static void main(String []args) {
		BigInteger a = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		//Map masp =new HashMap<String,String>();
		int b = 0;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		while(true) {
			if(b == 0) {
				break;
			}
			a = a.multiply(c);
			c = c.add(BigInteger.ONE);
			b--;
		}
		System.out.println(a);
		sc.close();
		
	}
}

package pta;
import java.math.BigInteger;
import java.util.Scanner;
public class fandsu {

	public static void main(String []args) {
		BigInteger a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextBigInteger();
		b = sc.nextInt();
		while(true) {
			if(b==0) {
				break;
			}
			//boolean flag = false;
			if(a.isProbablePrime(100)){
				b--;
				System.out.println(a);
			}
			a = a.nextProbablePrime();
		}
	}
}

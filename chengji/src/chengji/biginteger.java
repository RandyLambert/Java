package chengji;
import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a;
		a = sc.nextBigInteger();
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		int flag = 0;
		while(flag!=3)
		{
		
			
			if(b.mod(a).equals(BigInteger.ZERO)) {
				flag++;
				System.out.print(b+"\n");
			}
			b = b.add(BigInteger.ONE);
		}
		
	}

}

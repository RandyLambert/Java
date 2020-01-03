package pta;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dashuzhengchu {

		public static void main(String []args) {
int x = 0;
			BigInteger a;
			for(BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);;i = i.add(BigInteger.ONE))
			{
				if(i.mod(BigInteger.valueOf(103))==BigInteger.ZERO) {
					System.out.println(i);
					x++;
				}
				if(x==3) {
					break;
				}		
			}
		}
					
}

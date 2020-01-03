package pta;
import java.util.Scanner;
public class ss {
	public static void main(String []args) {
		long x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextLong();
		long z = x/1000/60/60;
		long y = (x - z*60*60*1000)/1000/60;
		long a = (x - z*60*60*1000 - y*60*1000)/1000;
		System.out.print(z+":"+y+":"+a+"\n");
		sc.close();
	}
}

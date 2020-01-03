package pta;
import java.util.*;

public class welcome {
	public static void main(String [] args) {
		String x;
		String e;
		int a = 10;
		int b = 20;
		double c = Math.pow(a, b);
		Scanner in = new Scanner(System.in);
		x = in.next();	
		e = in.next();
		int ans = 0;
		for(int i = 0;i < x.length();i++)
		{
			if(e.charAt(0) == x.charAt(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

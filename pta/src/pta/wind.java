package pta;
import java.util.*;
public class wind {
	public static void main(String[] args) {
		double ans,n,m;
		Scanner input = new Scanner(System.in);
		n = input.nextDouble();
		m = input.nextDouble();
		ans = 35.74+0.6215*n-35.75*Math.pow(m, 0.16)+0.4275*n*Math.pow(m, 0.16);
		System.out.println("The wind chill index is "+ans);
	}
}

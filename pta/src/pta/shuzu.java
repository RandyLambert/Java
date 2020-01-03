package pta;
import java.util.Scanner;
public class shuzu {
	public static void main(String []argc) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		double mx = -1000000;
		int ii = 0,jj = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		double [][]d = new double[a+1][b+1];
		for(int i = 0;i < a;i++) {
			for(int j = 0;j < b;j++) {
				d[i][j] = sc.nextDouble();
				if(d[i][j] > mx) {
					ii = i;
					jj = j;
					mx = d[i][j];
				}
			}
		}
		System.out.printf("The location of the largest element is %.1f at (%d, %d)\n", mx,ii,jj);
		
	}
}

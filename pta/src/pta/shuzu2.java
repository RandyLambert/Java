package pta;
import java.util.Scanner;
public class shuzu2 {
	public static void main(String []argc) {
		int a;
		Scanner sc = new Scanner(System.in);
		double mx = -1000000;
		int ii = 0,jj = 0;
		a = sc.nextInt();

		double [][]d = new double[a+10][a+10];
		double []hang = new double[a+10];
		double []lie = new double[a+10];
		
		for(int i = 0;i < a;i++) {
			for(int j = 0;j < a;j++) {
				d[i][j] = sc.nextDouble();
				hang[i] += d[i][j];
				lie[j] += d[i][j];
			}
		}
		double maxhang=-132132321,maxlei=-321312322;
		for(int i = 0;i < a;i++) {
			for(int j = 0;j < a;j++) {
				if(maxhang < hang[i])
					maxhang = hang[i];
				if(maxlei < lie[j])
					maxlei = lie[j];
			}
		}
		int anshang = 0,anslei = 0;
		System.out.printf("THighest row: [");
		for(int i = 0;i < a;i++) {
				if(hang[i] == maxhang)
					anshang++;
				if(lie[i] == maxlei)
					anslei++;

		}
	}
}

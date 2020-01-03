package chengji;
import java.util.Arrays;
import java.util.Scanner;
public class mingzi {
	
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String a [] = new String[cnt];
		for(int i = 0;i < cnt;i++) {
			a[i] = sc.next();
		}
		Arrays.sort(a, 0, cnt);
		for(int i = 0;i < cnt;i++) {
			System.out.printf("%s\n", a[i]);
		}
	}
	public static void main(String []args) {
		mingzi a = new mingzi();
		a.input();
	}
}
package pta;
import java.util.Scanner;
public class haomiao {
	private long a;
	
	void getinput() {
		Scanner in = new Scanner(System.in);
		a = in.nextLong();
	}
	
	void getans() {
		String ans;
		
		long hours = a/1000/60/60;
		long mins = (a - hours*1000*60*60)/1000/60;
		long miao = (a - mins*1000*60 - hours*1000*60*60)/1000;
		
		System.out.println(hours+":"+mins+":"+miao);
		
	}
	public static void main(String[] args) {
		
		haomiao temp = new haomiao();
		temp.getinput();
		temp.getans();
		
	}
}

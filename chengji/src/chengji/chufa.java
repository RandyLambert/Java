package chengji;
import java.util.*; 
import java.math.*;
public class chufa {
	String str;
	String[] ob ;
	void input() {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		solve();
	}
	void solve() {
		BigInteger bigsum,biga,bigb;
		
		if(str.indexOf('/')!=-1) {
			ob = str.split("\\D",0);
			biga = new BigInteger(ob[0]);
			bigb = new BigInteger(ob[1]);
			bigsum = biga.divide(bigb);
			System.out.println(bigsum);
		}
		else if(str.indexOf('+')!=-1) {
			ob = str.split("\\D",0);
			biga = new BigInteger(ob[0]);
			bigb = new BigInteger(ob[1]);
			bigsum = biga.add(bigb);
			System.out.println(bigsum);
		}
		else if(str.indexOf('-')!=-1) {
			ob = str.split("\\D",0);
			biga = new BigInteger(ob[0]);
			bigb = new BigInteger(ob[1]);
			bigsum = biga.subtract(bigb);
			System.out.println(bigsum);
		}
		else if(str.indexOf('*')!=-1) {
			ob = str.split("\\D",0);
			biga = new BigInteger(ob[0]);
			bigb = new BigInteger(ob[1]);
			bigsum = biga.multiply(bigb);
			System.out.println(bigsum);
		}
	}
	public static void main(String []args) {
		chufa a = new chufa();
		a.input();
	}
}

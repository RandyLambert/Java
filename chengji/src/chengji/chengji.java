package chengji;
import java.util.*;

public class chengji {
	
	
	public void input(){
		Scanner sc = new Scanner(System.in);

		Map mp = new HashMap();
		String a="";
		double b;
		while(true) {
			a = sc.next();
			if(a.equals("noname")) {
				break;
			}
			b = sc.nextDouble();
			mp.put(a,b);
		}
		a = sc.next();
		if(mp.containsKey(a)) {
			double ans = (double) mp.get(a);
			System.out.printf("%.2f\n",ans*0.21);
		}
		else {
			System.out.printf("Not found.\n");
		}
		
	}
	public static void main(String []args) {
		chengji a = new chengji();
		a.input();
	}
}
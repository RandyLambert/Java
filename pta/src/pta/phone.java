package pta;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class phone {
	public static void main(String []args) {
		Set<String> a = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		String a1;
		while(sc.hasNextLine()) {
			a1 = sc.nextLine();
			if(!a1.equals("end"))
				a.add(a1);
			else
				break;
		}
		while(sc.hasNextLine()) {
			a1 = sc.nextLine();
			if(!a1.equals("end"))
				a.add(a1);
			else
				break;
		}
		for(String xx : a) {
			System.out.println(xx);
		}
	}
}

package shiyan2;


public class quadraticequation {
	int flag;
	private double a,b,c;
	quadraticequation(int a1,int b1,int c1){
		a = a1;
		b = b1;
		c = c1;
	}
	
	double getdiscriminant() {
		return b*b - 4*a*c;
	}
	double getroot1() {
		if(getdiscriminant()>=0) {
			flag = 0;
			return (-b + Math.sqrt(getdiscriminant()))/2*a;
		}
		else {
			flag = 1;
			return 0;
		}
		
	}
	double getroot2() {
		if(getdiscriminant()>=0) {
			flag = 0;
			return (-b - Math.sqrt(getdiscriminant()))/2*a;
		}
		else {
			flag = 1;
			return 0;
		}
	}
	
	void getans() {
		if(flag == 0)
			System.out.printf("%f %f\n", getroot1(),getroot2());
		else
			System.out.printf("no ans\n");
	}
	public static void main(String []args){
		quadraticequation tp = new quadraticequation(5,5,6);
		tp.getroot1();
		tp.getroot2();
		tp.getans();
	}
}

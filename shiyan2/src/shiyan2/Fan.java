package shiyan2;

public class Fan {
	private int speed;
	boolean on;
	double radius;
	String clour;
	Fan(){
		speed = 1;
		on = false;
		radius = 5;
		clour = "blue";
	}
	
	Fan(String a,double b,boolean i){
		on = i;
		clour = a;
		radius = b;
		speed = 1;
	}
	
	void totring() {
		if(on == false) {
			if(speed == 1)
				System.out.printf("slow %s %f\n",clour,radius);
			if(speed == 2)
				System.out.printf("medium %s %f\n",clour,radius);
			if(speed == 3)
				System.out.printf("fast %s %f\n",clour,radius);
		}
		else {
			System.out.printf("turn it off %s %f\n",clour,radius);
		}
	}
	
	void change(int x) {
		if(0<x&& x < 4) {
			speed = x;
		}
	}
	
	public static void main(String []args){
		Fan a = new Fan((String)("Yellow"),10.0,true);
		Fan b = new Fan((String)("blue"),5.0,false);
		
		a.totring();
		b.totring();
	}
}

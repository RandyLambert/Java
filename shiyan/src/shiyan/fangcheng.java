package shiyan;
import java.util.Scanner;
public class fangcheng {
	 private double a,b,c,q,res1,res2;

	    void input(){
	        Scanner sc = new Scanner(System.in);
	        a = sc.nextDouble();
	        b = sc.nextDouble();
	        c = sc.nextDouble();
	    }

	    void jisuan(){
	        q = b*b-4*a*c;
	        if(q == 0){
	            res1 = (-b+Math.sqrt(q))/(2*a);
	        }else if(q < 0){
	            return ;
	        }else if(q > 0) {
	            res1 = (-b+Math.sqrt(q))/(2*a);
	            res2 = (-b-Math.sqrt(q))/(2*a);
	        }
	    }

	    void prin(){
	        if(q == 0)
	        	System.out.printf("The root is %f",this.res1);
	        else if(q < 0)
	        	System.out.printf("THe equartion has no real roots\n");
	        else
	        	System.out.printf("THe root are %f and %f\n",this.res1,this.res2);
	    }

	    public static void main(String []args){

	        fangcheng e =  new fangcheng();
	        e.input();
	        e.jisuan();
	        e.prin();
	    }
	}
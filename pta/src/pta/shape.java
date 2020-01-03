package pta;
import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

/*你写的代码将嵌入到这里*/
class RTriangle implements IShape{
	private double aa,bb;
	RTriangle(double a,double b){
		aa = a;
		bb = b;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		
		return aa*bb/2;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return aa+bb+Math.sqrt(aa*aa+bb*bb);
	}
}

public class shape{
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}

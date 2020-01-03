package shiyan;
import java.util.Scanner;
abstract class shape {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}

class DecimalFormat extends shape{

	DecimalFormat(){
		
	}
	
	public double getArea() {
		
		return 0;
	}

	@Override
	public double getPerimeter() {
		
		return 0;
	}
	
}
/* 你提交的代码将嵌入到这里 */ 
public class hhh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        int n=input.nextInt();
        double side = input.nextDouble();

        shape rp = new  RegularPolygon(n,side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}

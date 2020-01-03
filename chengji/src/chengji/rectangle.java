package chengji;

import java.util.Scanner;
/* 你的代码将被嵌入到这里 */
class Rectangle {
	private double ww , hh;
	Rectangle(double w,double h){
		ww = w;
		hh = h;
	}
	public double getArea() {
		return ww*hh;
	}
	public double getPerimeter() {
		return (ww+hh)*2;
	}
}
public class rectangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double w = input.nextDouble();
    double h = input.nextDouble();
    Rectangle myRectangle = new Rectangle(w, h);
    System.out.println(myRectangle.getArea());
    System.out.println(myRectangle.getPerimeter());

    input.close();
  }
}
package test;

class A
{
	int i;int j;
}

class triangle
{
private int a,b,c;
	int zhouchang() {
		return a+b+c;
	}
	void set(int _a,int _b,int _c){
		a = _a;
		b = _b;
		c = _c;
	}
	
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.printf("%c", a);
	}
}
public class hello {
	//类体中不能直接编写java语句，除非定义变量
	//主方法是程序入口
	//一个java原文件中可以定义多个class
	//一个java原文件中公开的累的话，只能有一个，并且该类的名称必须和java文件名称一致
	//每一个class当中都可以编写main函数都可以设定程序的入口向执行s.class中的main方法
	//当执行hello时，里面必须要有主方法
	int y = 10;
	//int b = new int;
	public static void main(String[] args) {
		//方法体
		//java语句以；结束
		//
		A aa = new A();
		triangle h = new triangle();
		h.set(1, 2, 3);
		h.print();
		//b = 100;
		aa.i = 10;
		aa.j = 100213;
		A bb = new A();
		//new a()在堆中分配一块区域，被被当做a对象
		//aa本身的内容是在栈中分配的
		//堆中内存的地址付给了aa
		//aa指向了堆中的内存，aa代表了堆中的内存,aa.i 代表aa这个静态指针变量所指的动态内存中a对象
		for(int i = 0;i < 10;i++) {
			
			System.out.println(aa.i);
			//System.in.read(bb.i);
			System.out.println("aaaahello world\ndddd");
			System.out.println(i);
		}
		
	
	}
}

class world{
	public static void main(String[] args) {
		//方法体
		//java语句以；结束
		System.out.println("bbbbhello world\ndddd");
		System.out.println("dasdsadas傻逼");
	
	}
}

class dadasd{
	public static void main(String[] args) {
		//方法体
		//java语句以；结束
		System.out.println("ddddello world\ndddd");
		System.out.println("dasdsadas傻逼");
	
	}
}
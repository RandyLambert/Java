package chengji;

import java.util.Arrays;

class People { 
    String name; 
    public People() {
           System.out.print(1); 
    }
    public People(String name) {
           System.out.print(2); 
           this.name = name;
    } 
} 
class Child extends People {
   People father; 
   public Child(String name) {
          System.out.print(3); 
          this.name = name; 
          father = new People(name + ":F");
   } 
   public Child(){ 
         System.out.print(4);
   } 
}
public class test {
	public static void main(String []args) {
		Child x = new Child("mike");
		String s = "hello ";
		System.out.println(s.concat("World!"));
		System.out.println(s);
		
		String s1 = "Hello";
		String s2 = "Hell"+"o";
		String s3 = "Hell";
		s3 = s3+"o";
		if(s1 == s2) {
			System.out.println(s1);
		}
		//Arrays.sort(s1, 0, 4);
		
		if(s1 == s3) {
			System.out.println(s1+" "+s3);
		}
		System.out.println(s1+" "+s2+" "+s3);
	}
}

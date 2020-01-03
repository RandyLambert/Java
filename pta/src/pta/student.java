package pta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Student {
	String number;
	String name;
	float score;

	// Constructor
	Student(String number1, String name1, float score1) {
		number = number1;
		name = name1;
		score = score1;
	}

	// Used to print student details in main()
	public String toString() {
		return this.number + " " + this.name + " " + this.score;
	}
}


public class student {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String number;
		String name;
		float score;
		for(int i = 0;i < 5;i++) {
			number = sc.next();
			name = sc.next();
			score = sc.nextFloat();
			ar.add(new Student(number,name,score));
		}
		ar.sort((o1,o2)->((Student)o1).number.compareTo(((Student)o2).number));
		sc.close();
		for(int i = 4;i >= 0;i--) {
			System.out.print(ar.get(i)+"\n");
		}
	}
}

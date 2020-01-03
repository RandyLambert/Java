package shiyan;

import java.util.Scanner;
public class shiyanzuoye {

	public static void main(String args){
		double grosspay,dedralpay,statepay,totalpay,nextpay;
		Scanner sc = new Scanner(System.in); 	
		System.out.println("enter employee's name:");
		String name = sc.nextLine();
		System.out.println("enter number of hours worked in a week:");
		double hours = sc.nextDouble();
		System.out.println("enter hourly pay rate:");
		double pay = sc.nextDouble();
		System.out.println("enter federal tax withholding rate:");
		double taxrate = sc.nextFloat();
		System.out.println("enter state tax withholding rate:");
		double withrate = sc.nextDouble();
		
		grosspay  = pay*hours;
        dedralpay = grosspay*taxrate;
        statepay = grosspay*withrate;
        totalpay = dedralpay + statepay;
        nextpay = grosspay - totalpay;
		
		System.out.printf("employee's name: %s\n",name);
		System.out.printf("Hours worked: %lf\n",hours);
		System.out.printf("Pay Rate: $%lf\n",pay);
		System.out.printf("Gross Tay: %lf\n",grosspay );
        System.out.println("Deduction");
        System.out.println("  edral Withholding(20.0%): $" + dedralpay);
        System.out.println("  State Witholding (9.0%): $" + statepay);
        System.out.println("  Total Deduction: $" + totalpay + "\n");
        System.out.println("Net pay: $" + nextpay);
	}
}



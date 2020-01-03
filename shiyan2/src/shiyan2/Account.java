package shiyan2;
import java.util.Scanner;
import java.util.Date;

public class Account {
	
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated = new Date();
		
		Account(int id,double d,double e){
			this.id = id;
			this.balance = d;
			this.annualInterestRate = e;
			
		}
		

		Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
		}


		void init(int id,double balance,double annualInterestRate){
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
		}
		
		double getMonthlyIntestRate(){
			return annualInterestRate; 
		}
		
		void deposit(double money){
			this.balance += money;
		}
		
		int withdraw(double money) {
			if(money > this.balance) {
				return 0;
			}
			else {
				this.balance-=money;
				return 1;
			}
		}
		
		void print() {
			dateCreated.getTime();
			System.out.println(dateCreated);
			System.out.print(balance);
		}
	
	public static void main(String []args){
		Account ans = new Account((int)1122,(double)20000,(double)4.5);
		ans.withdraw(2500);
		ans.deposit(3000);
		ans.print();
	}
}
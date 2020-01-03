package pta;
import java.util.Scanner;
public class replace {
	public static void main(String []args) {
		 Scanner sc = new Scanner(System.in);        
		    StringBuilder builder = new StringBuilder();       
		    StringBuilder finallyStr = new StringBuilder();            
		    while(true){           
		        String str = sc.nextLine();         
		        if("end".equals(str)) break;          
		        builder.append(str);       
		    }
		                       
		    String firstStr = sc.nextLine();      
		    String secondStr = sc.nextLine();
		                     
		    String[] textArr = builder.toString().split("\\s+");    
		    for(int i = 0; i<textArr.length; i++) {           
		        if(textArr[i].equals(firstStr)){               
		            textArr[i] = secondStr;          
		        }          
		        finallyStr.append(textArr[i]+" ");    
		    }              
		        System.out.println(finallyStr);    
		        sc.close();
	}
}

package pta;

import java.util.Arrays;
import java.util.Scanner;

public class paixu{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        char[] b = a.toCharArray();
        for(int i = 0;i < b.length;i++) {
        	for(int j = i+1;j<b.length;j++) {
        		if(b[i] > b[j]) {
        			char tp = b[i];
        			b[i] = b[j];
        			b[j] = tp; 
        		}
        	}
        }
        //Arrays.sort(b);
        System.out.println(b);
    }
}
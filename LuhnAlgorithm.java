package tamilnadu.chennai;

import java.util.Scanner;

public class LuhnAlgorithm {
      static int store;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter card number");
		String cardno = sc.nextLine();
		 validateCreditCardNumber(cardno);
		    
		}
	private static void validateCreditCardNumber(String cardno) {
         int sum=0;
         int[] num= new int[cardno.length()];
         
		  for(int i =0;i<cardno.length();i++) {
	 num[i]=Integer.parseInt(cardno.substring(i, i+1));
		  }
		  for(int i=num.length+1;i<num.length-1;i=i+2) {
			  store =num[i];
			  store =store*2;
			  if(store>9) {
				  store=store%10+1;
			  }
			  num[i]=store;
		  }
		  for(int i=0;i<num.length;i++) {
			  sum+=num[i];
		  }
		  if(store%10==0) {
		 System.out.println("it's a valid credit card number "+cardno); 
		  }
		  else {
			  System.out.println("it's a invalid credit card number "+cardno);  
		  }
		}
	}



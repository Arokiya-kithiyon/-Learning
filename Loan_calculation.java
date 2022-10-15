package tamilnadu.chennai;

import java.util.Scanner;

public class Loan_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Loan_calculation lc =new Loan_calculation();
           lc.emi_calculation();
	}

	private void emi_calculation() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   int num_of_years;
		   int pricipal_amount,  num_of_months;
		   System.out.println("enter principal amount");
		   pricipal_amount = sc.nextInt();
		   System.out.println("enter num of years to pay");
		   num_of_years=sc.nextInt();
		   System.out.println("enter anual interest");
		  float interest = sc.nextInt();
		   
		 float  interest_per_month=interest/12;
		   
		   num_of_months= num_of_years*12;
		    
	interest = (((pricipal_amount*interest_per_month)/100)*num_of_months);
	
	 float emi = pricipal_amount+interest;
	  System.out.println("emi per month "+emi/num_of_months);
	  System.out.println("extra paiyed amount "+interest);
	}

}

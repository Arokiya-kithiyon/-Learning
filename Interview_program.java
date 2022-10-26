package tamilnadu.chennai;

import java.util.Scanner;

public class Interview_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Interview_program ip = new Interview_program();
    // ip.common_multipies_of_given_numbers();
   //  ip.common_divisors_of_given_numbers();
   //  ip.prime_number();
     //ip.reverse_num();
   //  ip.palintrome();
    // ip.armstrong_number();
    // ip.neon_number();
     //ip.strong_number();
     //ip.factorial_of_givenNumber();
     //ip.LCM(6,8);
   //  ip.power(2,3);
    // ip.fibo_series();
     //ip.first_n_primeNumbers();
    // ip.printing_5To1_factorial();
   //  ip.printing_multiplication();
    // ip.printing_square_number();
    // ip.square_rootOfNumber();
   //  ip.spyNumber();
    // ip.primeNumInFibo_series();
       ip.increasing_baseAndExponencial();
	}
	private void increasing_baseAndExponencial() {

           for(int i=1;i<=5;i++) {
        	   int multiply=1; 
        	 
        	  for(int j=1;j<=3;j++) {
        		  
        		  multiply=multiply*i;
        	  }
        	  System.out.println(multiply);
           }
		
	}
	private void primeNumInFibo_series() {
	      int first=-1, second=1, count=0;
	      int temp=0, div=2;
	      for(int i=0;1<=10;i++) {
	    	 
	    	  temp=first+second ;
	    	  first=second;
	    	  second=temp;
	    	  System.out.print(temp);
	      
	     for(int j=div;j<temp;j++) {
	    	 if(temp%div==0) {
	    		 count++;
	    	 }
	    	 if(count==0) {
	    		 System.out.println("prime number in fibo series"+temp);
	    	 }
	     }
	     
	      }  
	}
	
	private void spyNumber() {
            int sum=0 , multiply=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			multiply*=rem;
			num/=10;
		}
		if(sum==multiply) {
			System.out.println(temp+" is a spy number");
		}
		else {
			System.out.println(temp+" not a spy number");
		}
	}
	private void square_rootOfNumber() {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=1;num>0;i=i+2) {
			num=num-i;
			count++;
		}
		System.out.println(count);
	}
	private void printing_square_number() {
		// 1 4 9 16 25 36
		for (int i =1;i<=10;i++) {
			System.out.print(i*i+" ");
		}
	}
	private void printing_multiplication() {
		// TODO Auto-generated method stub
		//printing 1*10 2*9 3*8..
		int multiplier=10;
		for (int i=1;i<=5;i++) {
			System.out.println(i*multiplier);
			multiplier--;
		}
		
	}
	private void printing_5To1_factorial() {
		// TODO Auto-generated method stub
		 for (int i=5;i>=1;i--) {
			 int fact=1;
			 for (int j=1;j<=i;j++) {
				 fact=fact*j;
				 
			 }
			 System.out.println(i+"! is= "+fact);
		 }
	}
	private void first_n_primeNumbers() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a nume=ber");
		int n =sc.nextInt();
		for(int num =1; num<=n;num++) {
			int count=0;
			for(int div=2; div<=num/2; div++) {
				if(num%div==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(num);
			}
		}
	}
	private void fibo_series() {
		// TODO Auto-generated method stub
		int first=-1;
		int second=1;
		int value;
		for(int i=1;i<=10;i++) {
			value =first+second;
			first=second;
			second=value;
			System.out.println(value);
		}
		
	}
	private void power(int base, int exponent) {
		// TODO Auto-generated method stub
		int power =1;
		for(int i=1; i<=exponent;i++) {
			power=power*base;
		}
		System.out.println("power value is "+power);
	}
	private void LCM(int no1, int no2) {
		// TODO Auto-generated method stub
		int big= no1>no2? no1:no2;
		while(big<100) {
			
				if(big%no1==0&&big%no2==0) {
			System.out.println(big);
			break;
		}
				big++;
		}
	}
	private void factorial_of_givenNumber() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter factorial number");
		int num =sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(num+" factorial value is "+fact);
	}
	private void strong_number() {
		// TODO Auto-generated method stub
		int num=145;
		int temp=num;
		int sum=0;
		int fact=1;
		while(num>0) {
			int rem=num%10;
		for (int i=1;i<=rem;i++) {
			fact=fact*i;
		}
			sum=sum+fact;
			num/=10;
			fact=1;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not strong number");
		}
	}
	private void neon_number() {
		// TODO Auto-generated method stub
		int num=9;
		int temp=num;
		int sum=0;
		num=num*num;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not neon number");
		}
	}
	private void armstrong_number() {
		// TODO Auto-generated method stub
		// 123  1*1*1+2*2*2+3*3*3 =123 armstrong number
		int num=153;
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem =num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}
	private void palintrome() {
		// TODO Auto-generated method stub
		   Scanner sc =new Scanner(System.in);
		   System.out.println("enter a number");
		   int num=sc.nextInt();
		   int rev=0;
		   int temp=num;
		   while (num>0) {
			   int rem =num%10;
			   rev = (rev*10)+rem;
			   num=num/10;
		   }
		   if (temp==rev) {
			   System.out.println(temp+" is palintrome number");
		   }
		   else {
			   System.out.println(temp+" is not a palitrome number");
		   }
		   
	}
	private void reverse_num() {
		// TODO Auto-generated method stub
		int num=1234;
		String rev="";
		while (num>0) {
			int no=num%10;
			rev=rev+no;
			num=num/10;
			}
	System.out.println(rev);
		
	}
	private void prime_number() {
		// TODO Auto-generated method stub
		// a number does not have a divisor is a prime number
		int check_num=52,count=0;
		
		for(int div=2;div<check_num;div++) {
			if(check_num%div==0) {
				//System.out.println(div);
				count++;
			}
		}
	if (count==0) {
	System.out.println(check_num+" is a prime number");
		}
	else {
		System.out.println(check_num+" is not a prime number");
	}
	}

	private void common_divisors_of_given_numbers() {
		// TODO Auto-generated method stub
		int no1= 18,no2=24,div=2;
		int small = no1<no2? no1:no2;
		for (div=div;div<small;div++ ) {
			if(no1%div==0&&no2%div==0) {
				System.out.println("common divisor "+div);
			}
		}
	}



	private void common_multipies_of_given_numbers() {
		// TODO Auto-generated method stub
		int no1=3, no2=5;	
	     int big = no1>no2? no1:no2;
	     for (int no=big;no<=100;no++) {
	    	 if(no%no1==0&&no%no2==0) {
	 System.out.println("common multiplies  "+no);
	    	 }
	     }
	}
}


	

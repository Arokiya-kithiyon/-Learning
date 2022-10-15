package tamilnadu.chennai;

import java.util.Scanner;

public class Electricity_bill {
     double    bill_to_pay, total_amount=0,average, count=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Electricity_bill Tn = new Electricity_bill();
          Tn.bill_1();   
	}
 public void bill_1() {
	 int[] unit = new int[6];
	 
	 for(int i=0;i<unit.length;i++) {
		 Scanner sc=new Scanner(System.in);
		 switch (i) {
		 case 0:
			 System.out.println("enter unit consumed for jan-feb");
			 break;
		 case 1:
			 System.out.println("enter unit consumed for mar-apl");
			 break;
		 case 2:
			 System.out.println("enter unit consumed for may-jun");
			 break;
		 case 3:
			 System.out.println("enter unit consumed for jul-aug");
			 break;
		 case 4:
			 System.out.println("enter unit consumed for sep-oct");
			 break;
		 case 5:
			 System.out.println("enter unit consumed for nov-dec");
		 }
		
		
		 unit[i] = sc.nextInt();
		 if(unit[i]<=100) {
			 bill_to_pay=0;
		 }
		 else if(unit[i]<=200) {
			 bill_to_pay=(unit[i]-100)*1.5;
		 }
		 else if (unit[i]<=500) {
			 bill_to_pay=(100*0)+(100*2)+((unit[i]-200)*3);
		 }
		 else if (unit[i]>500) {
			 bill_to_pay=(100*0)+(100*3.5)+(300*4.5)+((unit[i]-500)*6.6);
		 }
		 total_amount=total_amount+bill_to_pay;
				
	 }
	 System.out.println("Total yearly amount = "+total_amount);
	  average=total_amount/6;
	  System.out.println("average amount is "+average);
 }
}

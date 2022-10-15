package tamilnadu.chennai;

import java.util.Scanner;

public class Paper_bill {
     int mon_to_fri_paper_cost_per_day=5;
    public int sat_cost = 6;
    int sun_cost=7;
     int service_charge=30;
    int total_cost;
    int month;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper_bill bill = new Paper_bill();
		bill.amountCalculation();
     
	}
	private void amountCalculation() {
		// TODO Auto-generated method stub
		 System.out.println("press 1 for January"+"\n"+"press 2 for Febrary"+
	"\n"+"press 3 for March"+"\n"+"press 4 for April"+"\n"+"press 5 for May"
+"\n"+"press 6 for June"+"\n"+"press 7 for July"+"\n"+"press 8 for August"+
"\n"+"press 9 for September"+"\n"+"press 10 for October"+"\n"+"press 11 for November"
	+"\n"+"press 12 for December");
		 
			 Scanner sc = new Scanner(System.in);
			month = sc.nextInt();
	if(month==1||month==7||month==10)
	{
		total_cost =((21*mon_to_fri_paper_cost_per_day)+(5*sat_cost)+(5*sun_cost)+service_charge);
		
	}
	if(month==4)
	{
		total_cost =((21*mon_to_fri_paper_cost_per_day)+(5*sat_cost)+(4*sun_cost)+service_charge);
		
	}
	if(month==6||month==9||month==11)
	{
		total_cost =((22*mon_to_fri_paper_cost_per_day)+(4*sat_cost)+(4*sun_cost)+service_charge);
		
	}
	if(month==5)
	{
		total_cost =((22*mon_to_fri_paper_cost_per_day)+(4*sat_cost)+(5*sun_cost)+service_charge);
		
	}
	if(month==2)
	{
		total_cost =((20*mon_to_fri_paper_cost_per_day)+(4*sat_cost)+(4*sun_cost)+service_charge);
		
	}
	if(month==6||month==3)
	{
		total_cost =((23*mon_to_fri_paper_cost_per_day)+(4*sat_cost)+(4*sun_cost)+service_charge);
		
	}
	if(month==12)
	{
		total_cost =((22*mon_to_fri_paper_cost_per_day)+(5*sat_cost)+(4*sun_cost)+service_charge);
	
	}
	switch(month) {
	case 1:
	System.out.println("January month News paper bill amount Rs."+total_cost);
	break;
	case 2:
		System.out.println("Febrary month News paper bill amount Rs."+total_cost);
		break;
	case 3:
		System.out.println("March month News paper bill amount Rs."+total_cost);
		break;
	case 4:
		System.out.println("April month News paper bill amount Rs."+total_cost);
		break;
	case 5:
		System.out.println("May month News paper bill amount Rs."+total_cost);
		break;
	case 6:
		System.out.println("June month News paper bill amount Rs."+total_cost);
		break;
	case 7:
		System.out.println("July month News paper bill amount Rs."+total_cost);
		break;
	case 8:
		System.out.println("August month News paper bill amount Rs."+total_cost);
		break;
	case 9:
		System.out.println("September month News paper bill amount Rs."+total_cost);
		break;
	case 10:
		System.out.println("October month News paper bill amount Rs."+total_cost);
		break;
	case 11:
		System.out.println("November month News paper bill amount Rs."+total_cost);
		break;
	case 12:
		System.out.println("December month News paper bill amount Rs."+total_cost);
		break;
	}
	}

}

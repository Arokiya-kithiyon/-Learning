package tamilnadu.chennai;

import java.util.Scanner;

public class Pattern_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pattern_programs pp = new Pattern_programs();   
      // pp.pattern1();
      // pp.pattern2();
      // pp.pattern3();
      // pp.pattern4();
      // pp.pattern5();
       pp.pattern6();
       //pp.pattern7();
       //pp.pattern8();
      //pp.pattern_C();
       //pp.pattern_I();
       //pp.pattern_T();
       //pp.pattern_D();
     //  pp.pattern_O();
      // pp.pattern_B();
      // pp.pattern_H();
      // pp.pattern_Y();
       //pp.pattern_K();
      // pp.pattern_N();
      // pp.pattern_A();
     
       
     //  pp.practice_pattern1();
       //pp.practice_pattern2();
       //pp.pattern_practice3();
     
     // pp.pattern_practice4();
       //pp.pattern_practice5();
     // pp.pattern_practice6();
    //  pp.pattern_practice7();
    //  pp.pattern_practice8();
    
	}
	

	

				private void pattern_A() {
		// TODO Auto-generated method stub
	 				int no=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row value");
		int value = sc.nextInt();
		for(int row=value; row>=1;row--) {
			for(int col=1; col<=row; col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int col=1;col<=no; col++) {
				System.out.print(" ");
				
				
			}
		       System.out.println("*");
		       no+=2;
		       
		}
	}


				private void pattern_N() {
		// TODO Auto-generated method stub
	 		  
	 		for(int row=1; row<=5; row++) {
	 			 
	 			System.out.print("*");
				for(int col=1;col<=row; col++) {
					System.out.print(" ");
				}
				 System.out.print("*");
				  for(int col=row; col<=5; col++) {
					 
					   System.out.print(" ");
				   }
				  
				  System.out.println("*");
			 		}
	 		 
	  }


		private void pattern_K() {
		// TODO Auto-generated method stub
	 		 int count=3 ;
	 		for(int row=1; row<=4; row++) {
	 			System.out.print("*");
				for(int col=1;col<=count; col++) {
					System.out.print(" ");
				}
				 System.out.println("*");
			     count--;
			
				}	
	 		for(int row=1; row<=3; row++) {
	 			 
	 			System.out.print("*");
				for(int col=1;col<=row; col++) {
					System.out.print(" ");
				}
				 System.out.println("*");
			   
			
				}	
	}


		private void pattern_Y() {
		// TODO Auto-generated method stub
	 		 int count=7 ; 
		for(int row=1; row<=5; row++) {
			
			for(int col=1;col<=row; col++) {
				System.out.print(" ");
			}
			System.out.print("@");
		 for(int col=1; col<=count; col++) {
			 System.out.print(" ");
		 }
		 count-=2;
		 System.out.println("@");
			}	
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print(" ");
			}
			System.out.println("@");
		}
	}


		private void pattern_H() {
		// TODO Auto-generated method stub
		for(int row=1; row<=7;row++)
		{
			System.out.print("* ");
			for(int col=1;col<=11;col++)
			{
				System.out.print(" ");
			}
			System.out.println("* ");
			for(int col=1; col<=6; col++) {
				if(row==3)
				{
					System.out.print("*");
					System.out.print(" ");
					
				}
			}
		}
		
	}


		private void pattern_B() {
		// TODO Auto-generated method stub
	 		for(int col=1; col<=6; col++)
			{ 
	 			System.out.print("* ");  
			}
			System.out.println(); 

			for(int row=1; row<=6; row++)
			{ 
				
				System.out.print("*");
				for(int col=1; col<=11; col++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			
			}

			for(int col=1; col<6; col++)
			{ 
				System.out.print("* ");
				
				}
			for(int row=1; row<=6; row++)
			{ 
				
				System.out.print("*");
				for(int col=1; col<=11; col++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			
			}
            
			for(int col=1; col<=6; col++)
			{ 
				System.out.print("* ");  
				}
	}


		private void pattern_O() {
		// TODO Auto-generated method stub
	 		for(int col=1; col<=7; col++)
			{	
				if(col!=1 && col!=7)
				{
				System.out.print("* "); 
				}
				else
				{
					System.out.print("  ");
				}
				}
			System.out.println(); 

			for(int row=1; row<=6; row++)
			{ 
				
				System.out.print("*");
				for(int col=1; col<=11; col++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			
			}

			for(int col=1; col<=7; col++)
			{ 
				if(col!=1 && col!=7)
				{
				System.out.print("* "); 
				}
				else
				{
					System.out.print("  ");
				}
			}
	}


		private void pattern_D() {
		// TODO Auto-generated method stub
	 		for(int col=1; col<=6; col++)
			{ System.out.print("* ");   }
			System.out.println(); 

			for(int row=1; row<=6; row++)
			{ 
				
				System.out.print("*");
				for(int col=1; col<=11; col++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			
			}

			for(int col=1; col<=6; col++)
			{ System.out.print("* ");   }
	}


		private void pattern_practice8() {
		// TODO Auto-generated method stub
		int no=10, num=1; 
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=num; col++) {
				
				System.out.print(no+"  ");
			
			no--;	
			}
			System.out.println();
			num++;
		}
	}


		private void pattern_practice7() {
		// TODO Auto-generated method stub
		int no=1;
		for(char row='E'; row>='A'; row--) {
			for(int col=5; col>=no; col--) {
				System.out.print(row+ " ");
			}
			System.out.println();
			no++;
		}
	}


		private void pattern_practice6() {
		// TODO Auto-generated method stub
	 		 int num=5 ,no=1;
		for(int row=5; row>=1;row--) {
			for(int col=no; col<=4; col++) {
				System.out.print("* ");
			}
			for(int col=row; col>=num; col--) {
				System.out.print(col+" "); 
		}
			 num-=2;
			 no++;
			 System.out.println();
		}
		
	}


		private void pattern_T() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
		{ System.out.print("* ");   }
		System.out.println(); 

		for(int row=1; row<=6; row++)
		{ 
			for(int col=1; col<=3; col++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");   } 
	}


	private void pattern_I() {
		// TODO Auto-generated method stub

		for(int col=1; col<=7; col++)
		{ System.out.print("* ");   }
		System.out.println(); 

		for(int row=1; row<=6; row++)
		{ 
			for(int col=1; col<=3; col++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");   }

		for(int col=1; col<=7; col++)
		{ System.out.print("* ");   }
	}


	private void pattern_C() {
		// TODO Auto-generated method stub
		for(int col=1; col<=7; col++)
		{ System.out.print("* ");   }
		System.out.println(); 

		for(int row=1; row<=6; row++)
		{ System.out.println("* ");   }

		for(int col=1; col<=7; col++)
		{ System.out.print("* ");   }
		
	}


	private void pattern8() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++)
		{
		for(int col=1; col<row; col++)
		{ System.out.print(" " + " ");
		     }
		for(int star=1; star<=6-row; star++)
		{	System.out.print("* ");	}
		System.out.println(); 
		} 
	}


	private void pattern7() {
		// TODO Auto-generated method stub
		int no = 1; 
		for(int row = 1; row<=5; row++)
		{
		for(int col=1; col<=row; col++)
		{ System.out.print(no + " ");
		    no++;  }
		System.out.println(); 
		} 
	}


	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col + " "); 
			}
		System.out.println(); 
		}
	}
		
		
  

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row = 5;row>=1; row--)
		{	
			for(int col=1; col<row; col++)
			{ System.out.print(" " + " "); }
			
			for(int col=1; col<=6-row; col++)
        	{ System.out.print(col + "  "); }
		System.out.println(); 
		}
	}


	private void pattern_practice5() {
		// TODO Auto-generated method stub
		int no=1;
		for( int row=1; row<=5;row++)
	    {
	       for(int col=row;col<5;col++)
		   {
	    	   System.out.print("*"+" ");
			  
		   }
		

		   for(int col=row;col<=no;col++)
		   {
			   System.out.print(col+" ");
			  
		   }
		   System.out.println();
		  no+=2;
	    }
	}


	private void pattern_practice4() {
		// TODO Auto-generated method stub
		for(int row=5;row>1;row--)
		{
		   for(int col=row; col>1;col--)
		   {
			   System.out.print("*"+" ");
			
		   }
		   
		}
	}

	private void pattern_practice3() {
		// TODO Auto-generated method stub
		int no =5;
		for(int row=5;row>=1;row--)
		{
		   for(int col=row; col>1;col--)
		   {
			   System.out.print("*"+" ");
			
		   }
		
		   for(int col=5;col>=no;col--)
		   {
			   System.out.print(col+" ");
			  
		   }
		   System.out.println();
		  no--;
		}
	}

	private void practice_pattern2() {
		// TODO Auto-generated method stub
		int no=1;
		for(int row=5;row>=1;row--)
		{
		   for(int col=row; col>=1;col--)
		   {
			   System.out.print((col*no)+" ");
			   
			
		   }
		   System.out.println();
		  no++;
		}
	}

	private void practice_pattern1() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		   for(int col=row; col>=1;col--)
		   {
			   System.out.print(col+"  ");
			 
		   }
		   System.out.println();
		  
		}
		}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row = 5;row>=1; row--)
		{	
			for(int col=1; col<row; col++)
			{ System.out.print("*" + " "); }
			
			for(int col=1; col<=6-row; col++)
        	{ System.out.print(col + " "); }
		System.out.println(); 
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub

		for(int row =1; row<=5; row++)
		{
		for(int col=row; col<=5; col++)
		{ 
			System.out.print(col + " ");
		}
		System.out.println(); 
		}
		
 
	}

	private void pattern2() {
		// TODO Auto-generated method stub

		for(int row = 1;row<=5; row++)
		{
		for(int col = 5; col>=row; col--)
		{ System.out.print(col + " "); }
		System.out.println(); 
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row = 5;row>=1; row--)
		{	
			for(int col=1; col<=row; col++)
			{ System.out.print(col + " "); }
		System.out.println(); 
			
		}
	}

}

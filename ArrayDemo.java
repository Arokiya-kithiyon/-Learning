package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayDemo {
     static int no=04;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayDemo ad = new ArrayDemo();
       // ad.calculating_marks();
      //  ad.linear_search();
       // ad.elements_towards_left();
       //  ad.bubble_sort();
          //ad.bubble_sort2();
         ad.binary_search();
       //  ad.matrix_addition();
        //  ad.matrix_multiplication();
        //  ad.spiralMatrix();
         
        
         
	}

		private void spiralMatrix() {
		// TODO Auto-generated method stub
		int mincol=0, maxcol=3, minrow=0, maxrow=3, no=1;
		int[][]s=new int[4][4];
		
		
			for(int col=mincol; col<=maxcol;col++) {
				s[mincol][col]=no;
				
				no++;
				
			}
			minrow++;
			
			for(int row=minrow;row<=maxrow;row++) {
				
						s[row][maxcol]=no;
					no++;
							          
			}
			maxcol--;
			for (int col=maxcol; col>=mincol;col--) {
				s[maxrow][col]=no;
				no++;
			}
			maxrow--;
			for(int row=maxrow; row>=minrow;row--) {
				s[row][mincol]=no;
				no++;
			}
			mincol++;
			for(int col=mincol; col<=maxcol; col++) {
				s[minrow][col]=no;
				no++;
			}
			minrow++;
			for(int col=maxcol; col>=mincol;col--) {
				s[minrow][col]=no;
				no++;
			}
			for (int row=0;row<=3;row++) {
				for(int col=0; col<=3; col++) {
					System.out.print(s[row][col]+" ");
				}
				System.out.println();
			}
		}
	

	private void matrix_multiplication() {
		// TODO Auto-generated method stub
		int[][]a= {{1,2},{2,1}};
		int[][]b= {{2,2},{2,2}};
		int [][]c =new int[2][2];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				c[i][j]=0;
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]+b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void matrix_addition() {
		// TODO Auto-generated method stub
		 int[][] a = { {1,2}, {3,4} }; 

		    int[][] b = { {2,3}, {4,5} };
		    int[][] c = new int[2][2]; 
		    
		    for(int row=0; row<2; row++){
		    for(int col=0;col<2; col++)
		    {
		    c[row][col] = a[row][col] + b[row][col];  
		    }
		    }
		    for(int row=0; row<2; row++){
		      for(int col=0;col<2; col++)
		      {
		      System.out.print(c[row][col]+" "); 
		      }
		      System.out.println();
		      }
	}

	public void bubble_sort2() {
		// TODO Auto-generated method stub
		 int [] arr= {3,1,10,5,8,50};
		 
		 for (int i=1;i<arr.length;i++) {
			 for(int j=0;j<arr.length-i;j++) {
				 if(arr[j]<arr[j+1]) {
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				 }
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 
			 System.out.print(arr[i]+" ");
		 }
	}

	private void binary_search() {
		// TODO Auto-generated method stub
		int[] ar = {10, 20, 30, 34, 56, 78, 89, 90};		// Arrays.sort(ar); 
		//		     0	1	2	 3	4    5   6   7
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key");
int key =sc.nextInt(); 
int min =0, max = 7; 
while(min<=max){
int mid = (min+max)/ 2; 
if(key == ar[mid])	//100 == 90
	{	System.out.println("Yes, present at "+ mid);
		break;  }
else if(key>ar[mid])	//100>90
	{	
	min = mid +1; 
	}
else{
	max = mid - 1; 
	}
}
if(min>max)
{
	System.out.println("Element is not present");
} 
	}

	private void bubble_sort() {
		// TODO Auto-generated method stub
		int[] ar = { 12, 9, 8, 4};
		for(int j = 1;j<ar.length; j++)
		{
		for(int i =0; i<ar.length-j;i++)
		{
		if(ar[i]>ar[i+1]){
			int temp = ar[i];
			ar[i] = ar[i+1]; 
			ar[i+1] = temp; 
			}
		}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		} 
	}

	private void elements_towards_left() {
		// TODO Auto-generated method stub
		int[] arr= {3,6,9,5};
		     int i,temp =arr[0];
		     
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]= temp;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void linear_search() {
		// TODO Auto-generated method stub
		int[] dobs = { 22, 3, 15, 7, 27, 19}; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your dob ");
		int dob = sc.nextInt(); 
		for(int i=0; i<dobs.length; i++)
		{
		if(dobs[i] == dob)
		{
		System.out.println("yes, present at "+ i); 
		break; 
		}
		}
	}

	private void calculating_marks() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
			System.out.println("Tell me no. of subjects");
				int count = sc.nextInt(); 
				int total = 0; 
				int[] marks = new int[count]; 
				for(int i=0; i<count; i++)
					{
						System.out.println("Enter Mark: ");
						marks[i] = sc.nextInt(); 
						total+= marks[i]; 
						}
					System.out.println(total);
					System.out.println(total/count);
	}

}

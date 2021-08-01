package Array;

import java.util.Scanner;

public class array_rotation {

	public static void main(String[] args) 
	{
		//*********************** User define array ********************
		        int temp=0;
				Scanner sc=new Scanner(System.in);  
				System.out.print("Enter the number of elements you want to store: ");    
				int n=sc.nextInt();  
				int[] arr = new int[n];  
				System.out.println("Enter the elements of the array: ");  
				for(int i=0; i<n; i++)  
				{  
					arr[i]=sc.nextInt();  
				}  
				
				//*********** Rotate the array ************
				
				System.out.println("How many time you want to rotate the array ");
				int rot=sc.nextInt();  
				for(int i=0;i<rot;i++)
				{
					temp=arr[n-1];
					for(int j=n-1;j>0;j--)
					{
						arr[j]=arr[j-1];
					}
					arr[0]=temp;
				}
				
				//************** Print the array **************
				
				System.out.println("Array elements are: ");  
		        for (int i=0; i<n; i++)
		        {
		        	System.out.println(arr[i]);
		        }
		        sc.close();

	}

}
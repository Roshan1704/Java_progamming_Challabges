package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Find_K_th_max_min {

	public static void main(String[] args) 
	{
		//*********************** User define array ********************
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");    
		int n=sc.nextInt();  
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			arr[i]=sc.nextInt();  
		}  
		
		//Get the rank of the max/min element from user
		
		System.out.print("Enter the rank to find 'Kth' min/max: ");    
		int rank =sc.nextInt();
		
		Arrays.sort(arr); // Sort the array
		
		// Get the Kth Max/Min element
		
		if(rank==1)
		{
			System.out.println(""+rank+"st Max element is : "+arr[n-rank]);
			System.out.println(""+rank+"st Min element is : "+arr[rank-1]);
		}
		else if(rank==2)
		{
			System.out.println(""+rank+"nd Max element is : "+arr[n-rank]);
			System.out.println(""+rank+"nd Min element is : "+arr[rank-1]);
		}
		else if(rank==3)
		{
			System.out.println(""+rank+"rd Max element is : "+arr[n-rank]);
			System.out.println(""+rank+"rd Min element is : "+arr[rank-1]);
		}
		else
		{
			System.out.println(""+rank+"th Max element is : "+arr[n-rank]);
			System.out.println(""+rank+"th Min element is : "+arr[rank-1]);
		}
		
		
		System.out.print("Min element is : "+arr[0]+"\nMax element is : "+ arr[n-1]); // get the max and min element
		sc.close();
	}

}

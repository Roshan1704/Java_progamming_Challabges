package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class U_and_I {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store in array_1: ");    
		int n=sc.nextInt();  
		int[] arr1 = new int[n];  
		System.out.println("Enter the elements of the array1: ");  
		for(int i=0; i<n; i++)  
		{  
			arr1[i]=sc.nextInt();  
		}  
		
		
		System.out.print("Enter the number of elements you want to store in array_2: ");    
		int m=sc.nextInt();  
		int[] arr2 = new int[m];  
		System.out.println("Enter the elements of the array2: ");  
		for(int j=0;j<m; j++)  
		{  
			arr2[j]=sc.nextInt();  
		}
		int count=0;
		
		//******** Intersection program**************
		
		System.out.print("Intersection is: [ ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(arr1[i]==arr2[j])
				{
					count++;
					if(i==(n-1))
					{
						System.out.print(arr1[i]);
					}
					else
						System.out.print(arr1[i]+", ");
				}
			}
		}
		System.out.println(" ]");
	
		ArrayList<Integer> arr3= new ArrayList<Integer>();
		
		
		
		//******** Union program**************
		
		System.out.print("union is: ");
		
		for (int i = 0; i < arr1.length; i++)
			arr3.add(arr1[i]);
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(arr2[i]!=arr1[j])
				{
					if(j==(n-1))
					{
						arr3.add(arr2[i]);
					}		
				}
				else
					break;
			}
		}
		System.out.println(arr3);
			
		
	    
	    //System.out.println(" }");
	}
		
		
		
		
	}

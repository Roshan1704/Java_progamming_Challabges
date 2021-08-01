package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class union_and_intersection {
	
	
	static void intersection(ArrayList<Integer> arr1,int n,int m,ArrayList<Integer> arr2)
	{
		//Scanner reader = new Scanner(System.in); 
		for(int i=0; i<arr2.size(); i++)  
		{  
			for(int j=0; j<n; j++)  
			{  
				if(arr2.get(i)!=arr1.get(j))
				{
					arr2.remove(i);
					break;
				}
				
			}  	
		}
			System.out.println(arr2);
			System.out.println("end of intersection");
		}
	static void union(ArrayList<Integer> arr2,int m,int n,ArrayList<Integer> arr1)
	{
		ArrayList<Integer> arr3= new ArrayList<>();
        //System.out.println(" enter the data ");
		arr3.addAll(arr1);
		arr1.clear();
		//System.out.println(arr3.addAll(arr1));
		for(int i=0; i<arr2.size(); i++)  
		{  
			for(int j=0; j<n; j++)  
			{  
				if(arr2.get(i)==arr3.get(j))
				{
					arr2.remove(i);
					break;
				}
				
			}  	
		}
		arr3.addAll(arr2);
		System.out.println("Union : "+ arr3);
		System.out.println("end of union");
		
		
	}	
	public static void main(String[] args) 
	{
		//*********************** User define array ********************
		Scanner sc=new Scanner(System.in);  
		System.out.print("How elements you want to store in 1st array: ");    
		int n=sc.nextInt();  
		ArrayList<Integer> arr1= new ArrayList<>(n);
		System.out.println("Enter the elements of the 1nd array: ");  
		for(int i=0; i<n; i++)  
		{  
			arr1.add(sc.nextInt()); 
			
		} 
		
		System.out.print("How elements you want to store in 2nd array: ");    
		int m=sc.nextInt();  
		ArrayList<Integer> arr2= new ArrayList<>(m);
		System.out.println("Enter the elements of the 2nd array: ");  
		for(int i=0; i<m; i++)  
		{  
			arr2.add(sc.nextInt()); 
			
		} 
		
		//int[] arr3 = new int[m+n];
		
		//System.out.println("Press '1' for union and any other number for intersection ");
		union(arr1,n,m,arr2);
		intersection(arr2, m,n,arr1);
		
		
		sc.close();

	}

}

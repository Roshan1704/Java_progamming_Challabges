package Array;

import java.util.Scanner;

public class sort_without_algo {

	public static void main(String[] args) 
	{
		//*********************** User define array ********************
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");    
		int n=sc.nextInt();  
		int[] sort012 = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			sort012[i]=sc.nextInt();
			while(sort012[i]>2)
			{
				System.out.println("try again please");
				sort012[i]=sc.nextInt();
			}
		}  
		
		//******************** logic of sorting without any sorting algorithm ******************
		
		int count0=0,count1=0;
        for(int i=0;i<sort012.length;i++)
        {
            if(sort012[i]==0)
            count0++;
            else if(sort012[i]==1)
            count1++;
            else
            	continue;
        }
        int a=count0+count1;
        for(int i=0;i<sort012.length;i++)
        {
        	if(i<count0)
        	{
        		sort012[i]=0;
        	}
        	else if(i<a)
        	{
        		sort012[i]=1;
        	}
        	else
        		sort012[i]=2;
        }
        
        //***************** Print the sorted array *********************
        
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)
        {
        	System.out.println(sort012[i]);
        }
        sc.close();
	}

}

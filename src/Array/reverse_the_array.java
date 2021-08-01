package Array;
import java.util.Scanner;

public class reverse_the_array {

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
				
				//************* Print actual array ***************
				
				System.out.print("array is: { ");  
				for(int i=0; i<n; i++)  
				{  
					System.out.print(arr[i]);
					if(i<n-1)
						System.out.print(" , ");
				}
				System.out.println(" }");
				
				//************* Print Reverse array ***************
				
				System.out.print("Reversed array is : { ");
				int[] rev_arr = new int[n];
				for(int i=0; i<n; i++)  
				{  
					rev_arr[i]= arr[(n-1)-i];
					System.out.print(rev_arr[i]);
					if((n-1)-i>0)
						System.out.print(" , ");
				}
				System.out.println(" }");
				
				
				sc.close();

	}

}

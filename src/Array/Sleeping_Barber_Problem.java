package Array;

import java.util.Scanner;

public class Sleeping_Barber_Problem {

	public static void main(String[] args) 
	{
		String a="Barber";
		String b="Customer";
		
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of chair in the shops");    
		int n=sc.nextInt();
		int fc=0;
		while (true) 
		{
			if(n==0)
			{
				if(fc==0)
				{
					System.out.println("No customers! "+a+" is sleeping ");
				}
				else if(fc>=1)
				{
					System.out.println(""+a+ " is cutting hairs of one client");
					n-=fc;
					System.out.println("rest "+(fc-1)+" are waiting");			}
				else
					n--;
			}
			
		    System.out.println("Exit? (y exits)");
		    String input = sc.nextLine();
		    if (input.equals("y")) {
		        break;
		    }

		    System.out.println("Ok! Let's carry on!");
		}
		
		
	}

}

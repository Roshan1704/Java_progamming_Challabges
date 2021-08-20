package Random_Code;

import java.util.Scanner;

public class Collatz_Conjecture {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number between '1' to '2,147,483,647' : ");    
		long num=sc.nextLong();
		
		if(num!=1)
		{
			while(num>1)
			{
				if(num%2==0)
				{
					num=num/2;
				}
				else
					num=3*num+1;
				count++;
			}
			System.out.println("It took "+count+" attampts to get '1'");
		}
		else
			System.out.println("Congo! get '1' in first attampt.");
		

	}

}

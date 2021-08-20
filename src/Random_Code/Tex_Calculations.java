package Random_Code;

import java.util.Scanner;

public class Tex_Calculations {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Which Tax regime you wanna choose? \n press '1' for new regime and any other for old: ");
		int tax_reg=sc.nextInt();
		if(tax_reg==1)
			new_text_regime();
		else
			old_text_regime();
		
		sc.close();	
	}
	public static void new_text_regime()
	{
		double tax=0;
		Scanner sc=new Scanner(System.in);
		int gross_salary=sc.nextInt();
		if(gross_salary>=500000)
		{
			tax=tax+250000*0.05;
			if(gross_salary>=750000||gross_salary<1000000)
			{
				tax+=500000*0.20;
				if(gross_salary>1250000)
				{
					tax+=500000*0.20;
				}
			}
			
		}
	}
	public static void old_text_regime()
	{
		
	}
}
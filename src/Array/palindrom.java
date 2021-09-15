package Array;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		is_palindrom(n);
	
		sc.close();

	}
	public static void is_palindrom(int num)
	{
		String m= Integer.toString(num);
		int k=0;
		char[] ch=new char[m.length()];
		for(int i=m.length()-1;i>=0;i--)
		{
			ch[k] =m.charAt(i);
			k++;
		}
		m = String.valueOf(ch);
		if(m.equals(Integer.toString(num)))
			System.out.println("palindrom");
		else
			System.out.println("again");
		
		
	}

}
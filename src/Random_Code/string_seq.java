package Random_Code;

import java.util.Scanner;
import java.util.Stack;

public class string_seq 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the sequence");    
		String str=sc.nextLine();
		System.out.println(string_seq(str));

	}
	static Boolean string_seq(String str)
	{
		Stack<Character> st= new Stack();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
				st.push(str.charAt(i));
			else
			{
				if(st.isEmpty())
					return false;
				else
				{
					char st_pop=st.pop();
					if((str.charAt(i)==')'&& st_pop!='(')||(str.charAt(i)=='}'&& st_pop!='{')||(str.charAt(i)==']'&& st_pop!='['))
						return false;			
				}
			}
		}
		if(st.isEmpty())
			return true;
		else
			return false;
	}
}

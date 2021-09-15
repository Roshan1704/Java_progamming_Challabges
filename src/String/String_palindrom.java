package String;

import java.util.Scanner;

public class String_palindrom {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println(is_palindrom(str.toLowerCase()));
	
		sc.close();
	}
	public static boolean is_palindrom(String str)
	{
		
		int len= str.length(),k=0;
		char ch[] = new char[len]; 
		for(int j=0;j<len;j++)
		{
			if(((str.charAt(j)>='a')&&(str.charAt(j)<='z'))
					||(str.charAt(j)>='0'&&str.charAt(j)<='9'))
			{
				ch[k]= str.charAt(j);
				k++;
				//System.out.println(ch[j]);
			}
		}
		str = (String.valueOf(ch)).trim();
		
		StringBuffer sb= new StringBuffer(str);
		StringBuffer sb2= sb.reverse();
		String rev_str= ((sb2.toString()).toLowerCase());
		
		System.out.println(str);
		System.out.println(rev_str);
		if(rev_str.equals(str))
			return true;
		else
			return false;
		
	}

}

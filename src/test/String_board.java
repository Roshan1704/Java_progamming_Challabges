package test;

public class String_board {

	public static void main(String[] args) 
	{
		int i;
		/*
		 * String str = "​​​{​​​{​​​}​​​{​​​}​​​}​​​{​​​}{​​​}​​"; 
		 * String str2="{{}}}{";
		 */
		String str3 = "{​​​{​​​{​​​}​​​}​​​{​​​}​​​{​​​}";
		boolean not_valid = true;
		
		int count1=0,count2=0;
		for(i=0;i<str3.length();i++)
		{
			if(count2>count1)
			{
				System.out.println("string is invalid");
				break;
			}
			else
			{
				not_valid=false;
				if(str3.charAt(i)=='{')
					count1++;
				else if(str3.charAt(i)=='}')
					count2++;
			}
		}
		
		if(!not_valid)
		{
			if(count1==count2)
			{
				System.out.println("string is valid");
			}
			else
				System.out.println("string is invalid");
		}

	}

}



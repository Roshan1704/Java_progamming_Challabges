package String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Please enter the string ");    
		String str=sc.nextLine();
		int len= str.length();
		int k=0;
		/*
		 * char ch[]= new char[len]; for(int i=len-1;i>=0;i--) { ch[k]=str.charAt(i);
		 * k++; } str= String.valueOf(ch);
		 */
		//System.out.println(str);
		String[] str_arr= str.split(" ");
		str="";
		for(int i=(str_arr.length)-1;i>=0;i--)
		{
			str+= str_arr[i]+" ";
		}
		str=(str.substring(0,str.length() - 1)).replaceAll("\\s+"," ").trim();
		System.out.println(str);
		sc.close();
		
	}

}

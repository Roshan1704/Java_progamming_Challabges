package Random_Code;

import java.util.ArrayList;

public class Use_with_underscore_within_String {

	public static void main(String[] args) {
		String str="ABC";
		int k=0;
		ArrayList<String>str_store= new ArrayList<String>(str.length());
		str_store.add(str);
		str_store.add("_".concat(str));
		String cp_str=str_store.get(1);
		char ch[] = new char[cp_str.length()]; 
		for(int i=1;i<str_store.size();i++)
		{
			ch[k]= cp_str.charAt(i-1);
			ch[k+1]= cp_str.charAt(i);
			char temp= ch[k];
			ch[k]= ch[k+1];
			ch[k+1]= temp;
			str = String.valueOf(ch);
			str_store.add(str);
			k++;
		}
		System.out.println(str_store);
	}

}
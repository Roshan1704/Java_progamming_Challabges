package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist_prep {

	public static void main(String[] args) 
	{
		Scanner io= new Scanner(System.in);
		ArrayList<Integer> ls= new ArrayList<>(5);
		while(true) 
        { 
            ls.add(io.nextInt()); 
            System.out.println(ls);
        } 
		

	}

}

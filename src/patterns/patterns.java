package patterns;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Please enter the string ");    
		int row=sc.nextInt();
		pattern_1(row);
		sc.close();
	}

	/* For this pattern at row=6

	*
	**
	***
	****
	*****
	******
	
	*/
	
	
	public static void pattern_1(int row) 
	{
		for(int i=0;i<=row;i++)
		{
			for (int j = 0; j < i+1; j++) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

		
	}
	
	
	/* For this pattern at row=6

	******
    *****
    ****
    ***
    **
    *

	
	*/
	
	
	public static void pattern_2(int row) 
	{
		for(int i=0;i<=row;i++)
		{
			for (int j =row-i; j > 0; j--) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

		
	}
	
	/*
	
0	*
1	**
2	***
3	****
4	*****
5	******
6	*****
7   ****
8   ***
9   **
10  *
    
*/
	
	static void pattern_3(int row) {
        for (int i = 0; i < 2 * row; i++) {
            int total_Cols= i > row ? 2 * row - i: i;
            for (int j = 0; j < total_Cols; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
	
	
	
	/*
	 * public static void pattern_3(int row) { int k=1; for(int i=0;i<=2*row-2;i++)
	 * { if(i<row) { for (int j = 0; j < i+1; j++) { System.out.print("*");
	 * 
	 * } System.out.println(); } else { for (int j = 0; j <i-(2*k-1); j++) {
	 * System.out.print("* ");
	 * 
	 * } System.out.println(); k++; }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */
	

}

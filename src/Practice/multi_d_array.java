package Practice;

import java.util.Arrays;

public class multi_d_array {

	public static void main(String[] args) 
	{
		int[][] arr= {
				{1,2,3},
				{4,5},
				{7,8,9,10}
		};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].length);
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(arr[1][1]);


	}

}

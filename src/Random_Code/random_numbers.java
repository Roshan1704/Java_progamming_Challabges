package Random_Code;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class random_numbers 
{
	public static void main(String[] args) 
	{
		int count=0;
		//Math.random();
		for(int i=2;i<100;i++)
		{
			int rndm = ThreadLocalRandom.current().nextInt(1,100);
			if(rndm%2==0)
			{
				System.out.print(rndm);
				if(i!=99)
					System.out.print(",");
				count++;
			}
			else
				continue;
		}
		System.out.println("\nTotle random even numbers are: "+count);
		
	}

}

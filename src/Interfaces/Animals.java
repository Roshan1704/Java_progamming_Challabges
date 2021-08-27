package Interfaces;

public interface Animals 
{
	default void eat()
	{
		System.out.println("animal eats");
	}

}

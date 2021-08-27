package Interfaces;

public class Bat_2 extends Birds {

	public static void main(String[] args)
	{
		Birds b= new Bat_2();
		b.eat();

	}
	public void eat()
	{
		System.out.println("bat eats");
		super.eat();
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);  
	}
	protected int Bat_1() {
		System.out.println("come");
		return 0;
		
	}
}
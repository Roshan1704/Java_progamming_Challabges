package Practice;

public class String_buffer_d {

	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer();
		sb.append("RoshanRoshan");
		System.out.println(sb.capacity());
		sb.append("RoshanRoshan");
		System.out.println(sb.capacity());
		sb.append("RoshanRoshan");
		System.out.println(sb.capacity());

	}

}

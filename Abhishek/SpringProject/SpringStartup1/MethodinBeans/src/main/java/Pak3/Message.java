package Pak3;

public class Message {
	
/*	Message(int i,String str)
	{
		
		System.out.println(i);
	}
	Message(String str1)
	{
		
		System.out.println("str1");
	}*/
	private String message;
	
	public void setMessage(String message)

	{
		
		this.message=message;
		
	}
	public String getMessage()
	{
		
		return message;
	}

	public String A(String a)
	{
		
		message=a;
		
		return a;
	}
	public String A()
	{
		String str1="Hello hi";
		return str1;
	}
	
	
	
}

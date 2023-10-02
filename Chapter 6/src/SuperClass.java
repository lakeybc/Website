
public class SuperClass {



	public static void hello()
	{
		System.out.println("Hello from the Super Class");
	}
	public static void echo(String arg)
	{
		try
		{System.out.println("You entered: " + arg);}
		catch(Exception e)
		{System.out.println("Argument required");}
	}
	static class SubClass extends SuperClass
	{
		public static void main(String[] args) { 
			
			hello();
			SuperClass.hello();
			echo(args[0]);
		}
			public static void hello()
			{
				System.out.println("Hello from the Sub Class");
			}
		
	}
	}

	




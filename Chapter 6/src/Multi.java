
public class Multi {
	public static void main( String[] args) {
		
		String msg = "This is a local variable in the Multi class";
		System.out.println(msg);
		System.out.println(Data.txt);
		Data.greeting();
		Draw.line();
	}
	static class Data
	{
		public final static String txt = "This is a global variable in the Data class";
		public static void greeting()
		{
			System.out.print("This is a global method ");
			System.out.println("in the Data class");
		}
	}
	static class Draw
	{
		static void line()
		{
			System.out.println("______________________________");
		}
	}

}

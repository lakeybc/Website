
public class StringComparison {
	public static void main( String[] args) {
		
		String password = "bingo";
		
		try {
			if(args[0].toLowerCase().equals(password))
			{
				System.out.println("Password accepted.");
			}
			else 
			{
				System.out.println("Incorrect Password");
			}
		}
		catch(Exception e){
			System.out.println("Password require.");
		}
		
		
	}

}

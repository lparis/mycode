import java.security.NoSuchAlgorithmException;

public class MD5_Test
{
	public static void main(String[] args) {
		
		String input = "Enter your string here: This is my string. Now it is changed.";

		try 
		{
			MD5 myMD5 = new MD5(input);
		}
		
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		
		//System.out.println(MD5);
	}
}

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
	public MD5(String inputString) throws NoSuchAlgorithmException
	{
		MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
		digest.update(inputString.getBytes(), 0, inputString.length());
		System.out.println("DATA > " + inputString);
		System.out.println("MD5  > " + new BigInteger(1, digest.digest()).toString(16));
	}
	
	public String MD5(String inputString) throws NoSuchAlgorithmException
	{
		String returnMD5;
		MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
		digest.update(inputString.getBytes(), 0, inputString.length());
		returnMD5 = new BigInteger(1, digest.digest()).toString(16);
		return returnMD5;
	}
}

/**
public class MD5 
{
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		String string = "DAT: Change this string and a unique MD5 is generated. Once upon a time there was a city of purple.";
		
		MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
		digest.update(string.getBytes(), 0, string.length());
		System.out.println(string);
		System.out.println("MD5: " + new BigInteger(1, digest.digest()).toString(16));
	}
}
**/

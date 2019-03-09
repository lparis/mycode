import java.math.*;
import java.security.*;

public class MyMD5class
{
	// MessageDigest java.security.MessageDigest.getInstance(String algorithm) throws NoSuchAlgorithmException
	
	MessageDigest digester = MessageDigest.getInstance("MD5");
	byte[] bytes = new byte[8192];
	int byteCount;
	{
		while ((byteCount = in.read(bytes)) > 0)
		{
			digester.update(bytes, 0, byteCount);
		}
	byte[] digest = digester.digest();	 
	}
	
	
}

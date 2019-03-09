import java.security.*;
import java.math.*;

public class MyMD5 {

	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		String string = "suppose he should moons spam string array way onetow three";
		
		MessageDigest digest = java.security.MessageDigest.getInstance("MD5"); // Create instance of MD5 algorithm
		// byte[] hash = digest.digest();
		digest.update(string.getBytes(), 0, string.length());
		System.out.println("MD5: " + new BigInteger(1, digest.digest()).toString(16));
	}
}

// http://www.twmacinta.com/myjava/fast_md5.php#tutorial

// http://www.dzone.com/snippets/get-md5-hash-few-lines-java

//    This document describes the MD5 message-digest algorithm. The
// algorithm takes as input a message of arbitrary length and produces
// as output a 128-bit "fingerprint" or "message digest" of the input.

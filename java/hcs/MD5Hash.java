// lparis 2018

package hcs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Takes input string
// Creates instance of MD5 algorithm
// Returns string array hash type and value

public class MD5Hash {

	private static final String TYPE = "MD5";
	private static String hashValue = null;

	public void genMd5(String string) throws NoSuchAlgorithmException {
		MessageDigest digest = java.security.MessageDigest.getInstance(TYPE);
		digest.update(string.getBytes(), 0, string.length());
		hashValue = new BigInteger(1, digest.digest()).toString(16);
	}

	public String getHashValue() {
		return hashValue;
	}

	public String getType() {
		return TYPE;
	}
}

// lparis 2018

// Create instance of SHA-256 algorithm
// Takes plain text string as input; generate hash

/*
 * Create instance of SHA-256 algorithm
 * Takes plain text string as input
 * Returns hashValue and TYPE
 */

package hcs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA2Hash {

	private static final String TYPE = "SHA-256";
	private static String hashValue = null;

	public void genSha2(String string) throws NoSuchAlgorithmException {
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
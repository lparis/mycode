// lparis 2018

package hcs;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Hash {

	private static final String TYPE = "SHA-1";
	private static String hashValue = null;

	public void genSha1(String string) throws NoSuchAlgorithmException {
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

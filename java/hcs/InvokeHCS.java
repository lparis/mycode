// lparis 2018

package hcs;

import java.security.NoSuchAlgorithmException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ionic.sdk.error.SdkException;

public class InvokeHCS {

	static MD5Hash md5 = new MD5Hash();
	static SHA1Hash sha1 = new SHA1Hash();
	static SHA2Hash sha2 = new SHA2Hash();
	static IonicEncryption ionic = new IonicEncryption();

	static Scanner keyBoard = new Scanner(System.in);
	static String plainText = null;
	static String cipherText = null;
	static int choice;
	final static int LIMIT = 3;

	public static void main(String[] args) {

		plainText = getInput();

		try {
			md5.genMd5(plainText);
			sha1.genSha1(plainText);
			sha2.genSha2(plainText);
			ionic.genEncrypt(plainText);
		} catch (NoSuchAlgorithmException | SdkException e) {
			e.printStackTrace();
		}

		System.out.println(md5.getType() + " hash:       " + md5.getHashValue());
		System.out.println(sha1.getType() + " hash:     " + sha1.getHashValue());
		System.out.println(sha2.getType() + " hash:   " + sha2.getHashValue());
		System.out.println(ionic.getType() + " text:    " + ionic.getCipherText());

		cipherText = ionic.getCipherText();

		try {
			getChoice();
		} catch (InputMismatchException error) {
			error.printStackTrace();
			System.out.println("ERROR: " + error.getLocalizedMessage() + " entry.");
		}

		getCryptoHash(cipherText);
	}

	public static String getInput() {

		System.out.println("---------------");
		System.out.println("ENCRYPT-UR-SHIT");
		System.out.println("---------------");
		System.out.print("Plain text:     ");
		String input = keyBoard.nextLine();
		return input;
	}

	public static int getChoice() throws InputMismatchException {

		System.out.println("---------------");
		System.out.print("Enter choice:   '0' for MD5; '1' for SHA-1; '2' for SHA-2; '3' for all >> ");
		choice = keyBoard.nextInt();
		keyBoard.nextLine();

		while (choice > LIMIT) {
			System.out.println("ERROR: Invalid choice");
			System.out.print("Try again:   '0' for MD5; '1' for SHA-1; '2' for SHA-2; '3' for all >> ");
			choice = keyBoard.nextInt();
			keyBoard.nextLine();
		}
		return choice;
	}

	public static void getCryptoHash(String string) {
		System.out.println(ionic.getType() + " text:    " + cipherText);

		if (choice == 0 || choice == 3)
			try {
				md5.genMd5(string);
				System.out.println(md5.getType() + " hash:       " + md5.getHashValue());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

		if (choice == 1 || choice == 3)
			try {
				sha1.genSha1(string);
				System.out.println(sha1.getType() + " hash:     " + sha1.getHashValue());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

		if (choice == 2 || choice == 3)
			try {
				sha2.genSha2(string);
				System.out.println(sha2.getType() + " hash:   " + sha2.getHashValue());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
	}
}

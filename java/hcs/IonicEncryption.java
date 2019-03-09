// lparis 2018

/*
 * genEncrypt()
 * - Takes input string plainText.
 * - Creates new agent object.
 * - Creates string path to profile.
 * - Creates persistor (plain text).
 * - Initializes agent.
 * - Encrypts input string as cipherText.
 * 
 * getEncrypt()
 * - Resturns string array: reque
 */

package hcs;

import com.ionic.sdk.agent.Agent;
import com.ionic.sdk.agent.cipher.chunk.ChunkCipherV2;
import com.ionic.sdk.device.profile.persistor.DeviceProfilePersistorPlainText;
import com.ionic.sdk.error.AgentErrorModuleConstants;
import com.ionic.sdk.error.SdkException;

public class IonicEncryption {

	private static String cipherText;
	private static String plainText;
	private static final String TYPE = "Cipher";

	public void genEncrypt(String inputString) throws SdkException {
		try {
			Agent agent = new Agent();
			String profilePath = System.getProperty("user.home") + "/.ionicsecurity/profiles.pt";
			;
			DeviceProfilePersistorPlainText ptPersistor = new DeviceProfilePersistorPlainText(profilePath);
			agent.initialize(ptPersistor);

			ChunkCipherV2 cipher = new ChunkCipherV2(agent);
			cipherText = cipher.encrypt(inputString);
			plainText = cipher.decrypt(cipherText);

		} catch (SdkException e) {
			System.out.println(e);
			if (e.getReturnCode() == AgentErrorModuleConstants.ISAGENT_NO_DEVICE_PROFILE.value()) {
				System.out.println("Profile does not exist.");
			}
			if (e.getReturnCode() == AgentErrorModuleConstants.ISAGENT_KEY_DENIED.value()) {
				System.out.println("Key request denied.");
			}
		}
	}

	public String getCipherText() {
		return cipherText;
	}

	public String getPlainText() {
		return plainText;
	}

	public String getType() {
		return TYPE;
	}
}

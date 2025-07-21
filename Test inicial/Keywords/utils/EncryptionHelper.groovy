
package utils

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import org.apache.commons.codec.binary.Base64
import com.kms.katalon.core.annotation.Keyword

public class EncryptionHelper {

	private static final String ALGORITHM = "AES"
	private static final String KEY = "ThisIsASecretKey" // clave dummy de 16 bytes (como Katalon)

	@Keyword
	public static String encrypt(String plainText) {
		SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes("UTF-8"), ALGORITHM)
		Cipher cipher = Cipher.getInstance(ALGORITHM)
		cipher.init(Cipher.ENCRYPT_MODE, secretKey)
		byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"))
		return Base64.encodeBase64String(encryptedBytes)
	}
}
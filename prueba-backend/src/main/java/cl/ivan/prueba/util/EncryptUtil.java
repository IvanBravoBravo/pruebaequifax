package cl.ivan.prueba.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ivan
 */
public class EncryptUtil {
    public static String getEncrypted(String originalString){
        String sha256hex = DigestUtils.sha256Hex(originalString);
        return sha256hex;
    }
}

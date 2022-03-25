package cl.ivan.prueba;

import cl.ivan.prueba.util.EncryptUtil;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author ivanhoe
 */
public class EncryptUtilTest {
    
    public EncryptUtilTest() {
    }
    
    @Test
    public void testGetEncrypted() {
        System.out.println("--- getEncrypted");
        String originalString = "12345";
        String expResult = "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";
        String result = EncryptUtil.getEncrypted(originalString);
        assertEquals(expResult, result);
    }
    
}

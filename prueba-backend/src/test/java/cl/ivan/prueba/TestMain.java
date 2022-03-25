package cl.ivan.prueba;

import cl.ivan.prueba.util.EncryptUtil;

/**
 *
 * @author ivan
 */
public class TestMain {

    public static void main(String[] args) {
        String pass = "1234";
        System.out.println("pass : "+pass);
        String encrypted = EncryptUtil.getEncrypted(pass);
        System.out.println("encrypted : "+encrypted);
    }
    
}

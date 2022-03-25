package cl.ivan.prueba;

import cl.ivan.prueba.controller.AppController;
import cl.ivan.prueba.entity.Users;
import cl.ivan.prueba.repository.UserRepository;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author ivanhoe
 */
@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {

    @Mock
    AppController appController;

    @Mock
    UserRepository userRepository;

    private static final String PASS_1234 = "1234";
    private static final String PASS_1234_ENCRYPTED = "03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4";
    private static final String USUARIO = "ivan";
    private static final Users USER = new Users(1, USUARIO, PASS_1234_ENCRYPTED);

    @Before
    public void setUp() throws Exception {
        when(userRepository.findByUsuarioPassword(USUARIO, PASS_1234)).thenReturn(USER);
        when(appController.login(USUARIO, PASS_1234)).thenReturn("logeado");
    }

    public AppControllerTest() {
    }

    @Test
    public void testHealth() {
        System.out.println("test health");
        AppController instance = new AppController();
        String expResult = "OK";
        String result = instance.health();
        System.out.println("result : "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin() throws Exception {
        System.out.println("test login");
        String result = appController.login(USUARIO, PASS_1234);
        System.out.println("result : "+result);
        String expResult = "logeado";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFindByUsuarioPassword() throws Exception {
        System.out.println("test findByUsuarioPassword");
        Users user = userRepository.findByUsuarioPassword(USUARIO, PASS_1234);
        System.out.println("result : "+user.toString());
        String expResult = "cl.ivan.prueba.entity.Users[ iduser=1 , usuario = ivan]";
        assertEquals(expResult, user.toString());
    }

}

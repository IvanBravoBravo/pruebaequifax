package cl.ivan.prueba.controller;

import cl.ivan.prueba.domain.Resultados;
import cl.ivan.prueba.entity.Users;
import cl.ivan.prueba.facade.ResultadosFacade;
import cl.ivan.prueba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static cl.ivan.prueba.util.EncryptUtil.getEncrypted;
/**
 *
 * @author ivanhoe
 */
@RestController
public class AppController {
    
    private static final String MSG_OK = "OK";
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    ResultadosFacade resultadosFacade;

    @PostMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        System.out.println("usuario input : " + usuario);
        System.out.println("password input : " + password);
        Users logeado = userRepository.findByUsuarioPassword(usuario, getEncrypted(password));
        if (logeado == null) {
            System.out.println("user null  ");
            return "403 forbidden";
        } else {
            System.out.println("user encontrado : " + logeado.toString());
            return "logeado";
        }
    }

    @PostMapping("/home")
    public Resultados consultar(@RequestParam String lat, @RequestParam String lng) {
        System.out.println("input lat : " + lat + " , input lng : " + lng);
        Resultados resultado = resultadosFacade.getResultado(lat, lng);
        if (resultado == null) {
            System.out.println("resultado null  ");
        }
        System.out.println("resultado : "+resultado.toString());
        return resultado;
    }
    
    @GetMapping("/health")
    public String health(){
        return MSG_OK;
    }
}

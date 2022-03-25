package cl.ivan.prueba.repository;

import cl.ivan.prueba.entity.Users;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ivan
 */
public interface UserRepository extends CrudRepository<Users, String>{
    Users findByUsuarioPassword(String usuario, String password);
}

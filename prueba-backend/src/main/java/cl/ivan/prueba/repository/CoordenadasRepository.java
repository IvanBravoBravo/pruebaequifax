package cl.ivan.prueba.repository;

import cl.ivan.prueba.entity.Coordenadas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ivan
 */
public interface CoordenadasRepository  extends CrudRepository<Coordenadas, String>{
    Coordenadas findByLatLng(String lat, String lng);
}

package cl.ivan.prueba.facade;

import cl.ivan.prueba.domain.Datos;
import cl.ivan.prueba.repository.CoordenadasRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ivan.prueba.domain.Resultados;
import cl.ivan.prueba.domain.Resultados_;
import cl.ivan.prueba.entity.Coordenadas;

/**
 *
 * @author ivan
 */
@Service
@Data
public class ResultadosFacade {

    @Autowired
    CoordenadasRepository coordenadasRepository;

    public Resultados getResultado(String lat, String lng) {
        Resultados resultado = new Resultados();
        Resultados_ resultados = new Resultados_();
        Datos datos = new Datos();

        Coordenadas coordenada = coordenadasRepository.findByLatLng(lat, lng);
        if (coordenada != null) {
            datos.setCampo1(coordenada.getCampo1());
            datos.setCampo2(coordenada.getCampo2());
            resultados.setLanInput(lat);
            resultados.setLngInput(lng);
        }

        resultados.setDatos(datos);

        resultado.setResultados(resultados);
        return resultado;
    }
}

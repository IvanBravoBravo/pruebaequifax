package cl.ivan.prueba.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ivanhoe
 */
@Entity
@Table(catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coordenadas.findByLatLng", query = "SELECT c FROM Coordenadas c WHERE c.coordenadasPK.lat = :lat AND c.coordenadasPK.lng = :lng")
})
public class Coordenadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoordenadasPK coordenadasPK;
    @Column(length = 10)
    private String campo1;
    @Column(length = 10)
    private String campo2;

    public Coordenadas() {
    }

    public Coordenadas(CoordenadasPK coordenadasPK) {
        this.coordenadasPK = coordenadasPK;
    }

    public Coordenadas(String lat, String lng) {
        this.coordenadasPK = new CoordenadasPK(lat, lng);
    }

    public CoordenadasPK getCoordenadasPK() {
        return coordenadasPK;
    }

    public void setCoordenadasPK(CoordenadasPK coordenadasPK) {
        this.coordenadasPK = coordenadasPK;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coordenadasPK != null ? coordenadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Coordenadas)) {
            return false;
        }
        Coordenadas other = (Coordenadas) object;
        if ((this.coordenadasPK == null && other.coordenadasPK != null) || (this.coordenadasPK != null && !this.coordenadasPK.equals(other.coordenadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.ivan.prueba.entity.Coordenadas[ coordenadasPK=" + coordenadasPK + " ]";
    }
    
}

package cl.ivan.prueba.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ivan
 */
@Embeddable
public class CoordenadasPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false, length = 18)
    private String lat;
    @Basic(optional = false)
    @Column(nullable = false, length = 18)
    private String lng;

    public CoordenadasPK() {
    }

    public CoordenadasPK(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lat != null ? lat.hashCode() : 0);
        hash += (lng != null ? lng.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CoordenadasPK)) {
            return false;
        }
        CoordenadasPK other = (CoordenadasPK) object;
        if ((this.lat == null && other.lat != null) || (this.lat != null && !this.lat.equals(other.lat))) {
            return false;
        }
        if ((this.lng == null && other.lng != null) || (this.lng != null && !this.lng.equals(other.lng))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.ivan.prueba.entity.CoordenadasPK[ lat=" + lat + ", lng=" + lng + " ]";
    }
    
}

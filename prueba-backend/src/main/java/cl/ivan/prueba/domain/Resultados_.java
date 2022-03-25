package cl.ivan.prueba.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lan_input",
    "lng_input",
    "datos"
})
public class Resultados_ {

    @JsonProperty("lan_input")
    private String lanInput;
    @JsonProperty("lng_input")
    private String lngInput;
    @JsonProperty("datos")
    private Datos datos;
    
    @JsonProperty("lan_input")
    public String getLanInput() {
        return lanInput;
    }

    @JsonProperty("lan_input")
    public void setLanInput(String lanInput) {
        this.lanInput = lanInput;
    }

    @JsonProperty("lng_input")
    public String getLngInput() {
        return lngInput;
    }

    @JsonProperty("lng_input")
    public void setLngInput(String lngInput) {
        this.lngInput = lngInput;
    }

    @JsonProperty("datos")
    public Datos getDatos() {
        return datos;
    }

    @JsonProperty("datos")
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resultados_ .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lanInput");
        sb.append('=');
        sb.append(((this.lanInput == null)?"<null>":this.lanInput));
        sb.append(',');
        sb.append("lngInput");
        sb.append('=');
        sb.append(((this.lngInput == null)?"<null>":this.lngInput));
        sb.append(',');
        sb.append("datos");
        sb.append('=');
        sb.append(((this.datos == null)?"<null>":this.datos));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.lanInput == null)? 0 :this.lanInput.hashCode()));
        result = ((result* 31)+((this.lngInput == null)? 0 :this.lngInput.hashCode()));
        result = ((result* 31)+((this.datos == null)? 0 :this.datos.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resultados_) == false) {
            return false;
        }
        Resultados_ rhs = ((Resultados_) other);
        return (((((this.lanInput == rhs.lanInput)
                ||((this.lanInput!= null)
                &&this.lanInput.equals(rhs.lanInput)))
                &&((this.lngInput == rhs.lngInput)
                ||((this.lngInput!= null)
                &&this.lngInput.equals(rhs.lngInput)))))
                &&((this.datos == rhs.datos)||((this.datos!= null)
                &&this.datos.equals(rhs.datos))));
    }

}

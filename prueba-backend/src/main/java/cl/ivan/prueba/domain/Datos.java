package cl.ivan.prueba.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "campo1",
    "campo2"
})
public class Datos {

    @JsonProperty("campo1")
    private String campo1;
    @JsonProperty("campo2")
    private String campo2;
    
    @JsonProperty("campo1")
    public String getCampo1() {
        return campo1;
    }

    @JsonProperty("campo1")
    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    @JsonProperty("campo2")
    public String getCampo2() {
        return campo2;
    }

    @JsonProperty("campo2")
    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("campo1");
        sb.append('=');
        sb.append(((this.campo1 == null)?"<null>":this.campo1));
        sb.append(',');
        sb.append("campo2");
        sb.append('=');
        sb.append(((this.campo2 == null)?"<null>":this.campo2));
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
        result = ((result* 31)+((this.campo1 == null)? 0 :this.campo1 .hashCode()));
        result = ((result* 31)+((this.campo2 == null)? 0 :this.campo2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datos) == false) {
            return false;
        }
        Datos rhs = ((Datos) other);
        return (this.campo1 == rhs.campo1)
                ||((this.campo1 != null)
                &&this.campo1 .equals(rhs.campo1))
                &&((this.campo2 == rhs.campo2)
                ||((this.campo2 != null)
                &&this.campo2 .equals(rhs.campo2)));
    }

}

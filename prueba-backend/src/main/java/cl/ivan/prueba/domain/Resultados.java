package cl.ivan.prueba.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resultados"
})
public class Resultados {

    @JsonProperty("resultados")
    private Resultados_ resultados;
    
    @JsonProperty("resultados")
    public Resultados_ getResultados() {
        return resultados;
    }

    @JsonProperty("resultados")
    public void setResultados(Resultados_ resultados) {
        this.resultados = resultados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resultados.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resultados");
        sb.append('=');
        sb.append(((this.resultados == null)?"<null>":this.resultados));
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
        result = ((result* 31)+((this.resultados == null)? 0 :this.resultados.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resultados) == false) {
            return false;
        }
        Resultados rhs = ((Resultados) other);
        return (((this.resultados == rhs.resultados)
                ||((this.resultados!= null)
                &&this.resultados.equals(rhs.resultados))));
    }

}

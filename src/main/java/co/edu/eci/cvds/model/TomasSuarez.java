package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOMAS_SUAREZ")
public class TomasSuarez {
    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    
    @Column(name = "LETRA_RESP")
    private char letraResp;
    
    @Column(name = "JUSTIFICACION")
    private String justificacion;

    public TomasSuarez() {
    }

    public TomasSuarez(String pregunta, char letraResp, String justificacion) {
        this.pregunta = pregunta;
        this.letraResp = letraResp;
        this.justificacion = justificacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public char getLetraResp() {
        return letraResp;
    }

    public void setLetraResp(char letraResp) {
        this.letraResp = letraResp;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
        result = prime * result + ((justificacion == null) ? 0 : justificacion.hashCode());
        result = prime * result + ((int) letraResp);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TomasSuarez other = (TomasSuarez) obj;
        if (pregunta == null) {
            if (other.pregunta != null)
                return false;
        } else if (!pregunta.equals(other.pregunta))
            return false;
        if (justificacion == null) {
            if (other.justificacion != null)
                return false;
        } else if (!justificacion.equals(other.justificacion))
            return false;
        if (letraResp != other.letraResp)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TomasSuarez [pregunta=" + pregunta + ", letraResp=" + letraResp + ", justificacion=" + justificacion + "]";
    }
}

package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NICOLAS_ACHURI")
public class NicolasAchuri {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PREGUNTA")
    private String pregunta;

    @Column(name = "RESPUESTA")
    private String respuesta;

    public NicolasAchuri() {
    }

    public NicolasAchuri(Integer id, String pregunta, String respuesta) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "NicolasAchuri [id=" + id + ", pregunta=" + pregunta + ", respuesta=" + respuesta + "]";
    }
}
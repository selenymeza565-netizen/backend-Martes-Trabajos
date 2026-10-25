package co.edu.cesde.proyectointegradormarte.Domain.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long matriculaId;
    private String estado;
    private LocalDate fecha;
    private String observacion;

    public Asistencia() {
    }

    public Asistencia(
            long id,
            long matriculaId,
            String estado,
            LocalDate fecha,
            String observacion
    ) {
        this.id = id;
        this.matriculaId = matriculaId;
        this.estado = estado;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getMatriculaId() {
        return matriculaId;
    }
    public void setMatriculaId(long matriculaId) {
        this.matriculaId = matriculaId;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", MATRICULA ID: " + matriculaId +
                ", ESTADO: " + estado +
                ", FECHA: " + fecha +
                ", OBSERVACION: " + observacion;
    }
}

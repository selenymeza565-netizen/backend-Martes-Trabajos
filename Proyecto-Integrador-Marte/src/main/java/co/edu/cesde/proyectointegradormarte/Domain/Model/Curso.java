package co.edu.cesde.proyectointegradormarte.Domain.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long materiaId;
    private long docenteId;
    private String periodo;
    private int anio;

    public Curso() {
    }

    public Curso(
            long id,
            long materiaId,
            long docenteId,
            String periodo,
            int anio
    ) {
        this.id = id;
        this.materiaId = materiaId;
        this.docenteId = docenteId;
        this.periodo = periodo;
        this.anio = anio;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getMateriaId() {
        return materiaId;
    }
    public void setMateriaId(long materiaId) {
        this.materiaId = materiaId;
    }
    public long getDocenteId() {
        return docenteId;
    }
    public void setDocenteId(long docenteId) {
        this.docenteId = docenteId;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", MATERIA ID: " + materiaId +
                ", DOCENTE ID: " + docenteId +
                ", PERIODO: " + periodo +
                ", AÑO: " + anio;
    }
}
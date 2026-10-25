package co.edu.cesde.proyectointegradormarte.Domain.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cursoId;
    private long estudianteId;
    private int semestre;
    private int anio;

    public Matricula() {
    }

    public Matricula(
            long id,
            long cursoId,
            long estudianteId,
            int semestre,
            int anio
    ) {
        this.id = id;
        this.cursoId = cursoId;
        this.estudianteId = estudianteId;
        this.semestre = semestre;
        this.anio = anio;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCursoId() {
        return cursoId;
    }
    public void setCursoId(long cursoId) {
        this.cursoId = cursoId;
    }
    public long getEstudianteId() {
        return estudianteId;
    }
    public void setEstudianteId(long estudianteId) {
        this.estudianteId = estudianteId;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
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
                ", CURSO ID: " + cursoId +
                ", ESTUDIANTE ID: " + estudianteId +
                ", SEMESTRE: " + semestre +
                ", AÑO: " + anio;
    }
}
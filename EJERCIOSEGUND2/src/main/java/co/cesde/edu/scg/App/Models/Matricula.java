package co.cesde.edu.scg.App.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private Long studentId;
    private Long courseId;
    private String estado;

    public Matricula() {
    }

    public Matricula(
            Long id,
            String fecha,
            Long studentId,
            Long courseId,
            String estado
    ) {
        this.id = id;
        this.fecha = fecha;
        this.studentId = studentId;
        this.courseId = courseId;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", FECHA: " + fecha +
                ", STUDENT ID: " + studentId +
                ", COURSE ID: " + courseId +
                ", ESTADO: " + estado;
    }
}
package co.cesde.edu.scg.App.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descripcion;
    private String duracion;
    private String cupo;

    public Curso() {
    }

    public Curso(
            long id,
            String nombre,
            String descripcion,
            String duracion,
            String cupo
    ) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.cupo = cupo;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getCupo() {
        return cupo;
    }
    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", NOMBRE: " + nombre +
                ", DESCRIPCION: " + descripcion +
                ", DURACION: " + duracion +
                ", CUPO: " + cupo;
    }
}
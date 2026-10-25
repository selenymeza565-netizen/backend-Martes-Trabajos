package co.edu.cesde.proyectointegradormarte.Domain.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long matriculaId;
    private double valor;
    private LocalDate fecha;
    private String tipo;

    public Nota() {
    }

    public Nota(
            long id,
            long matriculaId,
            double valor,
            LocalDate fecha,
            String tipo
    ) {
        this.id = id;
        this.matriculaId = matriculaId;
        this.valor = valor;
        this.fecha = fecha;
        this.tipo = tipo;
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
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", MATRICULA ID: " + matriculaId +
                ", VALOR: " + valor +
                ", FECHA: " + fecha +
                ", TIPO: " + tipo;
    }
}
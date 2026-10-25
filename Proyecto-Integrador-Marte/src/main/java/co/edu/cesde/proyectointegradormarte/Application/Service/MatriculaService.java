package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Matricula;
import java.util.List;

public interface MatriculaService {

    Matricula guardar(Matricula matricula);
    Matricula buscar(Long id);
    List<Matricula> listar();
    Matricula actualizar(
            Long id,
            Matricula matricula
    );
    void borrar(Long id);
}
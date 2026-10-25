package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Curso;
import java.util.List;

public interface CursoService {

    Curso guardar(Curso curso);
    Curso buscar(Long id);
    List<Curso> listar();
    Curso actualizar(
            Long id,
            Curso curso
    );
    void borrar(Long id);
}
package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Estudiante;
import java.util.List;

public interface EstudianteService {

    Estudiante guardar(Estudiante estudiante);
    Estudiante buscar(Long id);
    List<Estudiante> listar();
    Estudiante actualizar(
            Long id,
            Estudiante estudiante
    );
    void borrar(Long id);
}

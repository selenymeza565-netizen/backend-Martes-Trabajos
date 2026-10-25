package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Docente;
import java.util.List;

public interface DocenteService {

    Docente guardar(Docente docente);
    Docente buscar(Long id);
    List<Docente> listar();
    Docente actualizar(
            Long id,
            Docente docente
    );
    void borrar(Long id);
}
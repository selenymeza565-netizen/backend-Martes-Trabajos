package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Nota;
import java.util.List;

public interface NotaService {

    Nota guardar(Nota nota);
    Nota buscar(Long id);
    List<Nota> listar();
    Nota actualizar(
            Long id,
            Nota nota
    );
    void borrar(Long id);
}
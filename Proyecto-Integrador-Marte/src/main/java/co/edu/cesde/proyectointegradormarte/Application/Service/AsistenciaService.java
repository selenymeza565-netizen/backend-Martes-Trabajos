package co.edu.cesde.proyectointegradormarte.Application.Service;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Asistencia;
import java.util.List;

public interface AsistenciaService {

    Asistencia guardar(Asistencia asistencia);
    Asistencia buscar(Long id);
    List<Asistencia> listar();
    Asistencia actualizar(
            Long id,
            Asistencia asistencia
    );
    void borrar(Long id);
}
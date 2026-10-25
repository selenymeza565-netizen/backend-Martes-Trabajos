package co.cesde.edu.scg.App.Services;

import co.cesde.edu.scg.App.Models.Matricula;
import java.util.List;

public interface MatriculaServices {
    List<Matricula> findAll();
    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
    void update(Matricula matricula);
}

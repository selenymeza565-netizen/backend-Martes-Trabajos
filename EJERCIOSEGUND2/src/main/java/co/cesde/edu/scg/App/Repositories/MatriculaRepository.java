package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Matricula;
import java.util.List;

public interface MatriculaRepository {

    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
    List<Matricula> findAll();
    void update(Matricula matricula);
}

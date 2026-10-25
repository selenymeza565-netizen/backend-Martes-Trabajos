package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Curso;
import java.util.List;

public interface CursoRepository {

    void save(Curso curso);
    Curso findById(Long id);
    void deleteById(Long id);
    List<Curso> findAll();
    void update(Curso curso);
}

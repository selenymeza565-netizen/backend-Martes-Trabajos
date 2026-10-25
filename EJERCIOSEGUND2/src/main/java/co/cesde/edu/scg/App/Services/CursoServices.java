package co.cesde.edu.scg.App.Services;

import co.cesde.edu.scg.App.Models.Curso;
import java.util.List;

public interface CursoServices {
    List<Curso> findAll();
    void save(Curso curso);
    Curso findById(Long id);
    void deleteById(Long id);
    void update(Curso curso);
}
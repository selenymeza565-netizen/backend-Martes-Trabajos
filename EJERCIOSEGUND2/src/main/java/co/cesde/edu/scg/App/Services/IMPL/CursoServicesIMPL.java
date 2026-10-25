package co.cesde.edu.scg.App.Services.IMPL;

import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Repositories.CursoRepository;
import co.cesde.edu.scg.App.Services.CursoServices;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoServicesIMPL implements CursoServices {

    private final CursoRepository cursoRepository;

    public CursoServicesIMPL(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public void save(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public void update(Curso curso) {
        cursoRepository.update(curso);
    }
}
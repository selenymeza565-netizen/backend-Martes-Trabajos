package co.cesde.edu.scg.App.Repositories.impl;

import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Repositories.CursoJpaRepository;
import co.cesde.edu.scg.App.Repositories.CursoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CursoRepositoryImpl implements CursoRepository {

    private final CursoJpaRepository cursoJpaRepository;

    public CursoRepositoryImpl(
            CursoJpaRepository cursoJpaRepository
    ) {
        this.cursoJpaRepository = cursoJpaRepository;
    }

    @Override
    public void save(Curso curso) {
        cursoJpaRepository.save(curso);
    }

    @Override
    public Curso findById(Long id) {
        return cursoJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        cursoJpaRepository.deleteById(id);
    }

    @Override
    public List<Curso> findAll() {
        return cursoJpaRepository.findAll();
    }

    @Override
    public void update(Curso curso) {
        if (cursoJpaRepository.existsById(curso.getId())) {
            cursoJpaRepository.save(curso);
        }
    }
}
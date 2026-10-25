package co.cesde.edu.scg.App.Repositories.impl;

import co.cesde.edu.scg.App.Models.Matricula;
import co.cesde.edu.scg.App.Repositories.MatriculaJpaRepository;
import co.cesde.edu.scg.App.Repositories.MatriculaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

    private final MatriculaJpaRepository matriculaJpaRepository;

    public MatriculaRepositoryImpl(
            MatriculaJpaRepository matriculaJpaRepository
    ) {
        this.matriculaJpaRepository = matriculaJpaRepository;
    }

    @Override
    public void save(Matricula matricula) {
        matriculaJpaRepository.save(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        return matriculaJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        matriculaJpaRepository.deleteById(id);
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaJpaRepository.findAll();
    }

    @Override
    public void update(Matricula matricula) {
        if (matriculaJpaRepository.existsById(matricula.getId())) {
            matriculaJpaRepository.save(matricula);
        }
    }
}

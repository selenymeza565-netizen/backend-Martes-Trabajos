package co.cesde.edu.scg.App.Services.IMPL;

import co.cesde.edu.scg.App.Models.Matricula;
import co.cesde.edu.scg.App.Repositories.MatriculaRepository;
import co.cesde.edu.scg.App.Services.MatriculaServices;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatriculaServicesIMPL implements MatriculaServices {

    private final MatriculaRepository matriculaRepository;

    public MatriculaServicesIMPL(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void save(Matricula matricula) {
        matriculaRepository.save(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public void update(Matricula matricula) {
        matriculaRepository.update(matricula);
    }
}
package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.MatriculaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Matricula;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.MatriculaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository matriculaRepository;

    public MatriculaServiceImpl(
            MatriculaRepository matriculaRepository
    ) {
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public Matricula guardar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula buscar(Long id) {
        return matriculaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula actualizar(
            Long id,
            Matricula matricula
    ) {
        if (!matriculaRepository.existsById(id)) {
            return null;
        }
        matricula.setId(id);
        return matriculaRepository.save(matricula);
    }

    @Override
    public void borrar(Long id) {
        matriculaRepository.deleteById(id);
    }
}

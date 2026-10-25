package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.EstudianteService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Estudiante;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(
            EstudianteRepository estudianteRepository
    ) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante buscar(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante actualizar(
            Long id,
            Estudiante estudiante
    ) {
        if (!estudianteRepository.existsById(id)) {
            return null;
        }
        estudiante.setId(id);
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void borrar(Long id) {
        estudianteRepository.deleteById(id);
    }
}
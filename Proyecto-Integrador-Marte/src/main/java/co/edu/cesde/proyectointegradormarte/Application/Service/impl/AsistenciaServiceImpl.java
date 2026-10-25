package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.AsistenciaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Asistencia;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.AsistenciaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    public AsistenciaServiceImpl(
            AsistenciaRepository asistenciaRepository
    ) {
        this.asistenciaRepository = asistenciaRepository;
    }

    @Override
    public Asistencia guardar(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia buscar(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Asistencia> listar() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia actualizar(
            Long id,
            Asistencia asistencia
    ) {
        if (!asistenciaRepository.existsById(id)) {
            return null;
        }
        asistencia.setId(id);
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public void borrar(Long id) {
        asistenciaRepository.deleteById(id);
    }
}
package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.NotaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Nota;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.NotaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;

    public NotaServiceImpl(
            NotaRepository notaRepository
    ) {
        this.notaRepository = notaRepository;
    }

    @Override
    public Nota guardar(Nota nota) {
        return notaRepository.save(nota);
    }

    @Override
    public Nota buscar(Long id) {
        return notaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Nota> listar() {
        return notaRepository.findAll();
    }

    @Override
    public Nota actualizar(
            Long id,
            Nota nota
    ) {
        if (!notaRepository.existsById(id)) {
            return null;
        }
        nota.setId(id);
        return notaRepository.save(nota);
    }

    @Override
    public void borrar(Long id) {
        notaRepository.deleteById(id);
    }
}
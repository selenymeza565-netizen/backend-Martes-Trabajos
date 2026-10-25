package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.DocenteService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Docente;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.DocenteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;

    public DocenteServiceImpl(
            DocenteRepository docenteRepository
    ) {
        this.docenteRepository = docenteRepository;
    }

    @Override
    public Docente guardar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente buscar(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Docente> listar() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente actualizar(
            Long id,
            Docente docente
    ) {
        if (!docenteRepository.existsById(id)) {
            return null;
        }
        docente.setId(id);
        return docenteRepository.save(docente);
    }

    @Override
    public void borrar(Long id) {
        docenteRepository.deleteById(id);
    }
}

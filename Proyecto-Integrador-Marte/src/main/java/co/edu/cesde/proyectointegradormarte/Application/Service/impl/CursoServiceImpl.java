package co.edu.cesde.proyectointegradormarte.Application.Service.impl;

import co.edu.cesde.proyectointegradormarte.Application.Service.CursoService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Curso;
import co.edu.cesde.proyectointegradormarte.Infrastructure.Repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(
            CursoRepository cursoRepository
    ) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso buscar(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso actualizar(
            Long id,
            Curso curso
    ) {
        if (!cursoRepository.existsById(id)) {
            return null;
        }
        curso.setId(id);
        return cursoRepository.save(curso);
    }

    @Override
    public void borrar(Long id) {
        cursoRepository.deleteById(id);
    }
}
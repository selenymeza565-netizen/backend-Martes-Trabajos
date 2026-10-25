package co.cesde.edu.scg.App.Services.Controller;

import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Services.CursoServices;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoServices cursoServices;

    public CursoController(CursoServices cursoServices) {
        this.cursoServices = cursoServices;
    }

    @PostMapping
    public void crearCurso(
            @RequestBody Curso curso
    ) {
        cursoServices.save(curso);
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(
            @PathVariable long id
    ) {
        return cursoServices.findById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(
            @PathVariable long id
    ) {
        cursoServices.deleteById(id);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoServices.findAll();
    }

    @PutMapping
    public void actualizarCurso(
            @RequestBody Curso curso
    ) {
        cursoServices.update(curso);
    }
}
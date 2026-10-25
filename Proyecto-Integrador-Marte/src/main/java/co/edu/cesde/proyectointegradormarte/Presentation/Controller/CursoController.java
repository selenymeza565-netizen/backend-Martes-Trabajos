package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.CursoService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(
            CursoService cursoService
    ) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscar(@PathVariable Long id) {
        Curso curso = cursoService.buscar(id);
        if (curso == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(curso);
    }

    @PostMapping
    public Curso guardar(@RequestBody Curso curso) {
        return cursoService.guardar(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizar(
            @PathVariable Long id,
            @RequestBody Curso curso
    ) {
        Curso actualizado = cursoService.actualizar(
                id,
                curso
        );
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        cursoService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
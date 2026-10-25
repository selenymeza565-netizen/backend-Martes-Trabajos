package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.MatriculaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Matricula;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    public MatriculaController(
            MatriculaService matriculaService
    ) {
        this.matriculaService = matriculaService;
    }

    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matricula> buscar(@PathVariable Long id) {
        Matricula matricula = matriculaService.buscar(id);
        if (matricula == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matricula);
    }

    @PostMapping
    public Matricula guardar(@RequestBody Matricula matricula) {
        return matriculaService.guardar(matricula);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Matricula> actualizar(
            @PathVariable Long id,
            @RequestBody Matricula matricula
    ) {
        Matricula actualizada = matriculaService.actualizar(
                id,
                matricula
        );
        if (actualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        matriculaService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
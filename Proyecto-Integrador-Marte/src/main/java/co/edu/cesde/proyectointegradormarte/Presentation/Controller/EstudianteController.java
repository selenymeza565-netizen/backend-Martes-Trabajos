package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.EstudianteService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Estudiante;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(
            EstudianteService estudianteService
    ) {
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> buscar(@PathVariable Long id) {
        Estudiante estudiante = estudianteService.buscar(id);
        if (estudiante == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudiante);
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizar(
            @PathVariable Long id,
            @RequestBody Estudiante estudiante
    ) {
        Estudiante actualizado = estudianteService.actualizar(
                id,
                estudiante
        );
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        estudianteService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
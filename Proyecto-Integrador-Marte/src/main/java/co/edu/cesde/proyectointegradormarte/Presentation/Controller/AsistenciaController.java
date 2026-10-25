package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.AsistenciaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Asistencia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {

    private final AsistenciaService asistenciaService;

    public AsistenciaController(
            AsistenciaService asistenciaService
    ) {
        this.asistenciaService = asistenciaService;
    }

    @GetMapping
    public List<Asistencia> listar() {
        return asistenciaService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> buscar(@PathVariable Long id) {
        Asistencia asistencia = asistenciaService.buscar(id);
        if (asistencia == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(asistencia);
    }

    @PostMapping
    public Asistencia guardar(@RequestBody Asistencia asistencia) {
        return asistenciaService.guardar(asistencia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asistencia> actualizar(
            @PathVariable Long id,
            @RequestBody Asistencia asistencia
    ) {
        Asistencia actualizada = asistenciaService.actualizar(
                id,
                asistencia
        );
        if (actualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        asistenciaService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}

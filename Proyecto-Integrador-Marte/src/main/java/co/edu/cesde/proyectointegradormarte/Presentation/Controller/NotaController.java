package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.NotaService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Nota;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private final NotaService notaService;

    public NotaController(
            NotaService notaService
    ) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<Nota> listar() {
        return notaService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nota> buscar(@PathVariable Long id) {
        Nota nota = notaService.buscar(id);
        if (nota == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nota);
    }

    @PostMapping
    public Nota guardar(@RequestBody Nota nota) {
        return notaService.guardar(nota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nota> actualizar(
            @PathVariable Long id,
            @RequestBody Nota nota
    ) {
        Nota actualizada = notaService.actualizar(
                id,
                nota
        );
        if (actualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        notaService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
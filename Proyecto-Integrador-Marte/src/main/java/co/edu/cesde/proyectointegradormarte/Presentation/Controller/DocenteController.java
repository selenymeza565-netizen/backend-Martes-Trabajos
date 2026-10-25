package co.edu.cesde.proyectointegradormarte.Presentation.Controller;

import co.edu.cesde.proyectointegradormarte.Application.Service.DocenteService;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Docente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    private final DocenteService docenteService;

    public DocenteController(
            DocenteService docenteService
    ) {
        this.docenteService = docenteService;
    }

    @GetMapping
    public List<Docente> listar() {
        return docenteService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> buscar(@PathVariable Long id) {
        Docente docente = docenteService.buscar(id);
        if (docente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(docente);
    }

    @PostMapping
    public Docente guardar(@RequestBody Docente docente) {
        return docenteService.guardar(docente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> actualizar(
            @PathVariable Long id,
            @RequestBody Docente docente
    ) {
        Docente actualizado = docenteService.actualizar(
                id,
                docente
        );
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        docenteService.borrar(id);
        return ResponseEntity.noContent().build();
    }
}
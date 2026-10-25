package co.cesde.edu.scg.App.Services.Controller;

import co.cesde.edu.scg.App.Models.Matricula;
import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Services.MatriculaServices;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaServices matriculaServices;

    public MatriculaController(MatriculaServices matriculaServices) {
        this.matriculaServices = matriculaServices;
    }

    @PostMapping
    public void crearMatricula(
            @RequestBody Matricula matricula
    ) {
        matriculaServices.save(matricula);
    }

    @GetMapping("/{id}")
    public Matricula buscarPorId(
            @PathVariable long id
    ) {
        return matriculaServices.findById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarMatricula(
            @PathVariable long id
    ) {
        matriculaServices.deleteById(id);
    }

    @GetMapping
    public List<Matricula> listarMatriculas() {
        return matriculaServices.findAll();
    }

    @PutMapping("/{id}")
    public void actualizarMatricula(
            @PathVariable long id,
            @RequestBody Matricula matricula
    ) {
        matricula.setId(id);
        matriculaServices.update(matricula);
    }
}
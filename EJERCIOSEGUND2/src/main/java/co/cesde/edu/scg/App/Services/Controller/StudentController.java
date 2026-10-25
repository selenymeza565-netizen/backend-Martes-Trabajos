package co.cesde.edu.scg.App.Services.Controller;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Services.StudentServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServices studentService;

    public StudentController(StudentServices studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Students> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Students> getById(
            @PathVariable Long id
    ) {
        return studentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Students> create(
            @Valid @RequestBody Students student
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(studentService.save(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Students> update(
            @PathVariable Long id,
            @Valid @RequestBody Students student
    ) {
        return studentService.update(id, student)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Students> patch(
            @PathVariable Long id,
            @RequestBody Students student
    ) {
        return studentService.patch(id, student)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id
    ) {
        if (studentService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        studentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
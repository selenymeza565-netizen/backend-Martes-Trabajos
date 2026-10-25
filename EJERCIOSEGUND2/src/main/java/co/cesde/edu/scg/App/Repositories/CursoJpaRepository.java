package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoJpaRepository extends JpaRepository<Curso, Long> {
}
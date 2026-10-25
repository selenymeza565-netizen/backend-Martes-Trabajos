package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaJpaRepository extends JpaRepository<Matricula, Long> {
}
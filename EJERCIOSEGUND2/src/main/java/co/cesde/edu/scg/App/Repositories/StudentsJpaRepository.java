package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsJpaRepository extends JpaRepository<Students, Long> {
}
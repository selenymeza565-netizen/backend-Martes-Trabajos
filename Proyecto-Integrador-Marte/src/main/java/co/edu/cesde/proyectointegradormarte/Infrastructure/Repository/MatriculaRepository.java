package co.edu.cesde.proyectointegradormarte.Infrastructure.Repository;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}


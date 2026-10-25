package co.edu.cesde.proyectointegradormarte.Infrastructure.Repository;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
}
package co.edu.cesde.proyectointegradormarte.Infrastructure.Repository;

import co.edu.cesde.proyectointegradormarte.Domain.Model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {
}



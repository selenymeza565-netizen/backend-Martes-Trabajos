package co.edu.cesde.proyectointegradormarte.Infrastructure.Repository;
import co.edu.cesde.proyectointegradormarte.Domain.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}

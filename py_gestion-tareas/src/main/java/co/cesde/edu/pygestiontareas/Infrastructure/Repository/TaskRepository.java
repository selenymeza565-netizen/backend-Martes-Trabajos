package co.cesde.edu.pygestiontareas.Infrastructure.Repository;

import co.cesde.edu.pygestiontareas.Domain.Model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {
}

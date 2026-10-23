package co.cesde.edu.pygestiontareas.Application.Service;

import co.cesde.edu.pygestiontareas.Domain.Model.TaskModel;
import java.util.List;

public interface TaskService {

    TaskModel createTask(TaskModel task);

    List<TaskModel> getAllTasks();

    TaskModel getTaskById(Long id);

    TaskModel updateTask(Long id, TaskModel taskDetails);

    TaskModel markAsCompleted(Long id);

    void deleteTask(Long id);
}

package co.cesde.edu.pygestiontareas.Application.Service.impl;

import co.cesde.edu.pygestiontareas.Application.Service.TaskService;
import co.cesde.edu.pygestiontareas.Domain.Model.TaskModel;
import co.cesde.edu.pygestiontareas.Infrastructure.Repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    @Transactional
    public TaskModel createTask(TaskModel task) {
        if (task.getCompleted() == null) {
            task.setCompleted(false);
        }
        if (task.getCreatedAt() == null) {
            task.setCreatedAt(LocalDateTime.now());
        }
        return taskRepository.save(task);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TaskModel getTaskById(Long id) {
        return taskRepository.findById(id).orElseGet(() -> {
            System.out.println("Tarea no encontrada con ID: " + id);
            return null;
        });
    }

    @Override
    @Transactional
    public TaskModel updateTask(Long id, TaskModel taskDetails) {
        TaskModel task = getTaskById(id);
        if (task == null) {
            return null;
        }
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        if (taskDetails.getCompleted() != null) {
            task.setCompleted(taskDetails.getCompleted());
        }
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public TaskModel markAsCompleted(Long id) {
        TaskModel task = getTaskById(id);
        if (task == null) {
            return null;
        }
        task.setCompleted(true);
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public void deleteTask(Long id) {
        TaskModel task = getTaskById(id);
        if (task != null) {
            taskRepository.delete(task);
        }
    }
}
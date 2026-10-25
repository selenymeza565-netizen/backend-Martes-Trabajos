package co.cesde.edu.scg.App.Repositories;

import co.cesde.edu.scg.App.Models.Students;

import java.util.List;

public interface StudentsRepository {

    void save(Students student);

    Students FindById(Long id);

    void deleteBy(Long id);

    List<Students> FindAll();

    void update(Students student);
}
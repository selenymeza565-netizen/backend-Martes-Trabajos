package co.cesde.edu.scg.App.Services;

import co.cesde.edu.scg.App.Models.Students;

import java.util.List;
import java.util.Optional;

public interface StudentServices {

    List<Students> findAll();

    Optional<Students> findById(Long studentsId);

    Students save(Students student);

    Optional<Students> update(
            Long studentsId,
            Students student
    );

    Optional<Students> patch(
            Long studentsId,
            Students student
    );

    void deleteById(Long studentsId);
}
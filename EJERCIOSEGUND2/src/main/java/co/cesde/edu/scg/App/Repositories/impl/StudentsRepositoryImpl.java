package co.cesde.edu.scg.App.Repositories.impl;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Repositories.StudentsJpaRepository;
import co.cesde.edu.scg.App.Repositories.StudentsRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentsRepositoryImpl implements StudentsRepository {

    private final StudentsJpaRepository studentsJpaRepository;

    public StudentsRepositoryImpl(
            StudentsJpaRepository studentsJpaRepository
    ) {
        this.studentsJpaRepository = studentsJpaRepository;
    }

    @Override
    public void save(Students student) {
        studentsJpaRepository.save(student);
    }

    @Override
    public Students FindById(Long id) {
        return studentsJpaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBy(Long id) {
        studentsJpaRepository.deleteById(id);
    }

    @Override
    public List<Students> FindAll() {
        return studentsJpaRepository.findAll();
    }

    @Override
    public void update(Students student) {
        if (studentsJpaRepository.existsById(student.getId())) {
            studentsJpaRepository.save(student);
        }
    }
}

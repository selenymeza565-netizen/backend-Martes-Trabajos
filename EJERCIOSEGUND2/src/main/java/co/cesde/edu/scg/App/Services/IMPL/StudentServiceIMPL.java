package co.cesde.edu.scg.App.Services.IMPL;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Repositories.StudentsJpaRepository;
import co.cesde.edu.scg.App.Services.StudentServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIMPL implements StudentServices {

    private final StudentsJpaRepository studentsRepository;

    public StudentServiceIMPL(StudentsJpaRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public List<Students> findAll() {
        return studentsRepository.findAll();
    }

    @Override
    public Optional<Students> findById(Long studentsId) {
        return studentsRepository.findById(studentsId);
    }

    @Override
    public Students save(Students student) {
        return studentsRepository.save(student);
    }

    @Override
    public Optional<Students> update(
            Long studentsId,
            Students student
    ) {
        return studentsRepository.findById(studentsId)
                .map(existing -> {
                    student.setStudentsId(studentsId);
                    return studentsRepository.save(student);
                });
    }

    @Override
    public Optional<Students> patch(
            Long studentsId,
            Students student
    ) {
        return studentsRepository.findById(studentsId)
                .map(existing -> {
                    if (student.getFirstName() != null) {
                        existing.setFirstName(student.getFirstName());
                    }
                    if (student.getLastName() != null) {
                        existing.setLastName(student.getLastName());
                    }
                    if (student.getEmail() != null) {
                        existing.setEmail(student.getEmail());
                    }
                    if (student.getPhone() != null) {
                        existing.setPhone(student.getPhone());
                    }
                    return studentsRepository.save(existing);
                });
    }

    @Override
    public void deleteById(Long studentsId) {
        studentsRepository.deleteById(studentsId);
    }
}
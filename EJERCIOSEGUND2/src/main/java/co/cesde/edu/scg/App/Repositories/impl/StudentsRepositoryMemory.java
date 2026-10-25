package co.cesde.edu.scg.App.Repositories.impl;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Repositories.StudentsRepository;
import java.util.List;

public class StudentsRepositoryMemory implements StudentsRepository {

    private final List<Students> students;

    public StudentsRepositoryMemory(List<Students> students) {
        this.students = students;
    }

    @Override
    public void save(Students student) {
        students.add(student);
    }

    @Override
    public Students FindById(Long id) {
        for (Students student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteBy(Long id) {
        students.removeIf(student -> student.getId() == id);
    }

    @Override
    public List<Students> FindAll() {
        return students;
    }

    @Override
    public void update(Students student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return;
            }
        }
    }
}
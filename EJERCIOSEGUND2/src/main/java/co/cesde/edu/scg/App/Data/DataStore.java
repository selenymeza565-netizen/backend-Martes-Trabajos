package co.cesde.edu.scg.App.Data;

import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Models.Matricula;
import co.cesde.edu.scg.App.Models.Students;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static final List<Students> listStudents = new ArrayList<>();
    private static final List<Curso> listCursos = new ArrayList<>();
    private static final List<Matricula> listMatriculas = new ArrayList<>();

    public DataStore() {
    }

    //STUDENTS

    public static List<Students> getAllStudents() {
        return listStudents;
    }

    public static void addStudents(Students student) {
        listStudents.add(student);
    }

    public static Students findStudentById(long id) {
        for (Students student : listStudents) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void removeStudents(long id) {
        Students student = findStudentById(id);
        if (student != null) {
            listStudents.remove(student);
        }
    }

    //CURSO

    public static List<Curso> getAllCursos() {
        return listCursos;
    }

    public static void addCursos(Curso curso) {
        listCursos.add(curso);
    }

    public static Curso findCursoById(long id) {
        for (Curso curso : listCursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        return null;
    }

    public static void removeCursos(long id) {
        Curso curso = findCursoById(id);
        if (curso != null) {
            listCursos.remove(curso);
        }
    }

    //MATRICULA

    public static List<Matricula> getAllMatriculas() {
        return listMatriculas;
    }

    public static void addMatriculas(Matricula matricula) {
        listMatriculas.add(matricula);
    }

    public static Matricula findMatriculaById(long id) {
        for (Matricula matricula : listMatriculas) {
            if (matricula.getId() == id) {
                return matricula;
            }
        }
        return null;
    }

    public static void removeMatriculas(long id) {
        Matricula matricula = findMatriculaById(id);
        if (matricula != null) {
            listMatriculas.remove(matricula);
        }
    }
}


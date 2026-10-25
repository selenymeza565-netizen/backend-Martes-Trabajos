package co.cesde.edu.scg.App;

import co.cesde.edu.scg.App.Data.DataStore;
import co.cesde.edu.scg.App.Repositories.Console.StudentConsole;
import co.cesde.edu.scg.App.Repositories.StudentsRepository;
import co.cesde.edu.scg.App.Repositories.impl.StudentsRepositoryImpl;
import co.cesde.edu.scg.App.Services.StudentServices;
import co.cesde.edu.scg.App.Services.IMPL.StudentServiceIMPL;
 /*
public class Main {
    public static void main(String[] args) {
        StudentsRepository studentsRepository = new StudentsRepositoryImpl(DataStore.getAllStudents());
        StudentServices studentService = new StudentServiceIMPL(studentsRepository);
        StudentConsole studentConsole = new StudentConsole(studentService);

        studentConsole.createStudent();
        studentConsole.listStudents();
    }
}

       /* DataStore dataStore = new DataStore();

        dataStore.addStudents(new Students(1L, "Jhon", "Doe", "jhon.doe@mail.com", "3001234567"));
        dataStore.addStudents(new Students(2L, "Jane", "Smith", "jane.smith@mail.com", "3019876543"));

        dataStore.getAllStudents().forEach((Students student) -> {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName());
        });

        dataStore.addCursos(new Curso(1L, "Arte", "Dibujo, pintura e imagenes", "6 meses", "30"));
        dataStore.addCursos(new Curso(2L, "Herramientas Digitales", "Word, Excel, PowerPoint", "8 meses", "20"));

        dataStore.getAllCursos().forEach((Curso curso) -> {
            System.out.println("ID: " + curso.getId() + ", Nombre: " + curso.getNombre() + ", Descripcion: " + curso.getDescripcion() + ", Duracion: " + curso.getDuracion() + ", Cupo: " + curso.getCupo());
        });

        dataStore.addMatriculas(new Matricula(1L, "10/03/2026", "Maria", dataStore.getAllCursos().get(0), "Activa"));
        dataStore.addMatriculas(new Matricula(2L, "15/03/2026", "Juan", dataStore.getAllCursos().get(1), "Activa"));

        dataStore.getAllMatriculas().forEach((Matricula matricula) -> {
            System.out.println("ID: " + matricula.getId() + ", Fecha: " + matricula.getFecha() + ", Estudiante: " + matricula.getEstudiante() + ", Curso: " + matricula.getCurso().getNombre() + ", Estado: " + matricula.getEstado());
        });
    }
}


             List<Students> listStudents = new ArrayList<>();
        listStudents.add(new Students(1L, "Jhon", "Doe", "jhon.doe@mail.com", "3001234567"));
        listStudents.add(new Students(2L, "Jane", "Smith", "jane.smith@mail.com", "3019876543"));
        listStudents.add(new Students(3L, "Maria", "Gonzalez", "maria.gonzalez@mail.com", "3024567890"));
        listStudents.add(new Students(4L, "Juan", "Perez", "juan.perez@mail.com", "3036543210"));
        listStudents.add(new Students(5L, "Luis", "Ramirez", "luis.ramirez@mail.com", "3041122334"));

        for (Students student : listStudents) {
            System.out.println("ID: " + student.getId() +
                    ", Nombre: " + student.getFirstName() +
                    " " + student.getLastName() +
                    ", Email: " + student.getEmail() +
                    ", Telefono: " + student.getPhone());
        }

        List<Curso> listCursos = new ArrayList<>();
        listCursos.add(new Curso(1L, "Arte", "Dibujo, pintura e imagenes", "6 meses", "30"));
        listCursos.add(new Curso(2L, "Herramientas Digitales", "Word, Excel, PowerPoint", "8 meses", "20"));
        listCursos.add(new Curso(3L, "Cocina", "Preparacion y pasteleria", "11 meses", "25"));
        listCursos.add(new Curso(4L, "Fotografia", "Luz, camara y composicion", "9 meses", "22"));
        listCursos.add(new Curso(5L, "Geografia", "Clima, mapas y poblaciones", "7 meses", "16"));

        for (Curso curso : listCursos) {
            System.out.println("ID: " + curso.getId() +
                    ", Nombre: " + curso.getNombre() +
                    ", Descripcion: " + curso.getDescripcion() +
                    ", Duracion: " + curso.getDuracion() +
                    ", Cupo: " + curso.getCupo());
        }

        List<Matricula> listMatriculas = new ArrayList<>();
        listMatriculas.add(new Matricula(1L, "10/03/2026", "Maria", listCursos.get(0), "Activa"));
        listMatriculas.add(new Matricula(2L, "15/03/2026", "Juan", listCursos.get(2), "Activa"));

        for (Matricula matricula : listMatriculas) {
            System.out.println("ID: " + matricula.getId() +
                    ", Fecha: " + matricula.getFecha() +
                    ", Estudiante: " + matricula.getEstudiante() +
                    ", Curso: " + matricula.getCurso().getNombre() +
                    ", Estado: " + matricula.getEstado());
        }
    }
} */
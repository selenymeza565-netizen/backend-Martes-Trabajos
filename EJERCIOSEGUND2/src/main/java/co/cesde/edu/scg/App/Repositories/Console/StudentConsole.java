package co.cesde.edu.scg.App.Repositories.Console;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Services.StudentServices;
import co.cesde.edu.scg.App.Services.StudentServices;

import java.util.List;
import java.util.Scanner;

public class StudentConsole {
    private final StudentServices  studentService;
    private final Scanner scanner;

    public StudentConsole(StudentServices studentService) {
        this.studentService = studentService;
        this.scanner = new Scanner((System.in));
    }
    public StudentServices getStudentService() {
        return studentService;
    }
    public void createStudent(){
        System.out.println("\n ----Crear Estudiante ----");
        System.out.println("Ingrese ID: ");
        Long id =Long.parseLong(scanner.nextLine());
        System.out.println("ingrese Nombre: ");
        String FirstName =scanner.nextLine();
        System.out.println("ingrese Apellido: ");
        String LastName =scanner.nextLine();
        System.out.println("ingrese Email: ");
        String Email =scanner.nextLine();
        System.out.println("ingrese Telefono: ");
        String Telefono =scanner.nextLine();

        Students student = new Students(id,FirstName,LastName,Email,Telefono);
        studentService.save(student);
        System.out.println("Estudiante creado con exito");
    }
    public void createStudents(){
        System.out.println();
    }
    public void listStudents() {
        List<Students> students = studentService.findAll();
        students.forEach(System.out::println);

    }
}
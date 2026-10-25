package co.cesde.edu.scg.App.Repositories.Console;

import co.cesde.edu.scg.App.Models.Matricula;
import co.cesde.edu.scg.App.Services.MatriculaServices;

import java.util.List;
import java.util.Scanner;

public class MatriculaConsole {

    private final MatriculaServices matriculaServices;
    private final Scanner scanner;

    public MatriculaConsole(MatriculaServices matriculaServices) {
        this.matriculaServices = matriculaServices;
        this.scanner = new Scanner(System.in);
    }

    public MatriculaServices getMatriculaServices() {
        return matriculaServices;
    }

    public void createMatricula() {
        System.out.println("\n ---- Crear Matricula ----");

        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.println("Ingrese Fecha: ");
        String fecha = scanner.nextLine();

        System.out.println("Ingrese ID del Estudiante: ");
        Long studentId = Long.parseLong(scanner.nextLine());

        System.out.println("Ingrese ID del Curso: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.println("Ingrese Estado: ");
        String estado = scanner.nextLine();

        Matricula matricula = new Matricula(
                id,
                fecha,
                studentId,
                courseId,
                estado
        );

        matriculaServices.save(matricula);
        System.out.println("Matricula creada con exito");
    }

    public void listMatriculas() {
        List<Matricula> matriculas = matriculaServices.findAll();
        matriculas.forEach(System.out::println);
    }
}
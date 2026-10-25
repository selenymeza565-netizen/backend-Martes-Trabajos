package co.cesde.edu.scg.App.Repositories.Console;

import co.cesde.edu.scg.App.Models.Curso;
import co.cesde.edu.scg.App.Services.CursoServices;

import java.util.List;
import java.util.Scanner;

public class CursoConsole {
    private final CursoServices cursoServices;
    private final Scanner scanner;

    public CursoConsole(CursoServices cursoServices) {
        this.cursoServices = cursoServices;
        this.scanner = new Scanner(System.in);
    }

    public void createCurso() {
        System.out.println("\n ---- Crear Curso ----");
        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Ingrese Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese Descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese Duracion: ");
        String duracion = scanner.nextLine();
        System.out.println("Ingrese Cupo: ");
        String cupo = scanner.nextLine();

        Curso curso = new Curso(id, nombre, descripcion, duracion, cupo);
        cursoServices.save(curso);
        System.out.println("Curso creado con exito");
    }

    public void listCursos() {
        List<Curso> cursos = cursoServices.findAll();
        cursos.forEach(System.out::println);
    }
}
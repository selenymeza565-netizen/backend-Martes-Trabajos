package EJERCICIOSEGUND2Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
        "EJERCICIOSEGUND2Application",
        "co.cesde.edu.scg.App"
})
@EntityScan("co.cesde.edu.scg.App.Models")
@EnableJpaRepositories("co.cesde.edu.scg.App.Repositories")
public class EjercicioMartesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioMartesApplication.class, args);
    }
}
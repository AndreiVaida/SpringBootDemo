package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EntityScan(basePackages = {"domain"})
@ComponentScan(basePackages = {"controller", "service", "configuration"})
@EnableJpaRepositories(basePackages = {"repository"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

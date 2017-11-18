package sk.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"sk.persistence"}) //The base package can also be replaced by only "sk". Doing that will scan all the packages which starts with sk. Same goes with below scanning.
@EntityScan(basePackages = {"sk.domain"})
@ComponentScan(basePackages = {"sk"})
public class HotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }
}

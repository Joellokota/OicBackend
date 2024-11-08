package com.andyalex.oicbackend;

import com.andyalex.oicbackend.entities.CarnetOrdre;
import com.andyalex.oicbackend.repository.CarnetOrdreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OicBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OicBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CarnetOrdreRepository carnetOrdreRepository) {
        return args -> {
            carnetOrdreRepository.saveAll(
                    List.of(
                            CarnetOrdre.builder()
                                    .ordre("999888877")
                                    .libelle("My ordre 1")
                                    .dateEmission(LocalDate.of(2024, 5, 21))
                                    .dateExecution(LocalDate.of(2024, 12, 29))
                                    .description("My description")
                                    .build(),
                            CarnetOrdre.builder()
                                    .ordre("1228882")
                                    .libelle("My ordre 2")
                                    .dateEmission(LocalDate.of(2024, 5, 21))
                                    .dateExecution(LocalDate.of(2024, 12, 29))
                                    .description("My description")
                                    .build(),
                            CarnetOrdre.builder()
                                    .ordre("12999882")
                                    .libelle("My ordre 3")
                                    .dateEmission(LocalDate.of(2024, 5, 21))
                                    .dateExecution(LocalDate.of(2024, 12, 29))
                                    .description("My description")
                                    .build(),
                            CarnetOrdre.builder()
                                    .ordre("67772772")
                                    .libelle("My ordre 4")
                                    .dateEmission(LocalDate.of(2024, 5, 21))
                                    .dateExecution(LocalDate.of(2024, 12, 29))
                                    .description("My description")
                                    .build()
                            )
            );
        };
    }
}

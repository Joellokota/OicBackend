package com.andyalex.oicbackend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @Builder @AllArgsConstructor
@NoArgsConstructor
@Table(name = "carnet_ordre")
@Entity
public class CarnetOrdre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ordre;
    private String libelle;
    private String description;
    private LocalDate dateEmission;
    private LocalDate dateExecution;
//    @ManyToOne
//    private Customer customerId;
}

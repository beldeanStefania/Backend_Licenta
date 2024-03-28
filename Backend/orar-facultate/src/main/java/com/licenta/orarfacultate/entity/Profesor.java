package com.licenta.orarfacultate.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Profesor")
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nume")
    private String nume;
}

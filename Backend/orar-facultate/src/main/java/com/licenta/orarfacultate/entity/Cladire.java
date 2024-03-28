package com.licenta.orarfacultate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Cladire")
@Getter
@Setter
public class Cladire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cladire")
    private Set<Sala> sala;

    @Column(name = "nume")
    private String nume;

}

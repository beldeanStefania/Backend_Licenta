package com.licenta.orarfacultate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Sala")
@Getter
@Setter
public class Sala {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_cladire")
    private Cladire cladire;

    @Column(name = "nume")
    private String nume;


}

package com.licenta.orarfacultate.entity;

import com.licenta.orarfacultate.entity.Activitate;
import com.licenta.orarfacultate.entity.Sala;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Entity
@Table(name = "Orar")
@Getter
@Setter
public class Orar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_activitate", nullable = false)
    private Activitate activitate;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    private Sala sala;

    @Column(name = "zi", nullable = false)
    private String zi;

    @Column(name = "ora_inceput", nullable = false)
    private Time oraInceput;

    @Column(name = "ora_sfarsit", nullable = false)
    private Time oraSfarsit;

    @Column(name = "disponibilitate", nullable = false)
    private Boolean disponibilitate;

}


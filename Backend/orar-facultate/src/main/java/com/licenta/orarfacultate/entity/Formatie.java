package com.licenta.orarfacultate.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "Formatie")
@Data
public class Formatie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "an")
    private int an;

    @Column(name = "grupa")
    private int grupa;

    @Column(name = "semigrupa")
    private int semigrupa;
}

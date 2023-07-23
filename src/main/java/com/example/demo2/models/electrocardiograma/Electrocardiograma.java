package com.example.demo2.models.electrocardiograma;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Electrocardiograma {
    @Id
    @Column(name = "id_electrocardiograma", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Integer ritmo;

    @Column(name = "frecuencia_cardiaca")
    private Integer frecuenciaCardiaca;

    @Column(length = 200)
    private String eje;

    private Integer qrs;

    @Column(length = 200)
    private String ondaP;

    @Column(length = 200)
    private String ondaT;

    private Integer st;

    private Integer pr;

    private Integer qtc;

    @Column(length = 200)
    private String conclusion;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

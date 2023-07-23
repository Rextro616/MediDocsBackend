package com.example.demo2.models.torax;

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
public class Torax {
    @Id
    @Column(name = "id_torax", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "partes_blandas", length = 200)
    private String partesBlandas;

    @Column(name = "partes_oseas", length = 200)
    private String partesOseas;

    @Column(name = "campos_pulmonares", length = 200)
    private String camposPulmonares;

    @Column(name = "silueta_cardiovascular", length = 200)
    private String siluetaCardiovascular;

    @Column(name = "indice_cardiotoracico", length = 200)
    private String indiceCardiotoracico;

    @Column(length = 200)
    private String conclusiones;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

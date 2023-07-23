package com.example.demo2.models.neurologico;

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
public class Neurologico {
    @Id
    @Column(name = "id_neurologico", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private Integer glasgow;

    @Column(name = "movilidad_activa", length = 200)
    private String movilidadActiva;

    @Column(name = "movilidad_pasiva", length = 200)
    private String movilidadPasiva;

    @Column(name = "movilidad_refleja", length = 200)
    private String movilidadRefleja;

    @Column(name = "pares_craneales", length = 200)
    private String paresCraneales;

    @Column(length = 200)
    private String sensibilidad;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

package com.example.demo2.models.sinromatico;

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
public class Sindromatico {
    @Id
    @Column(name = "id_sindromatico", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200)
    private String nombre;

    @Column(length = 200)
    private String diagnosticoEtiologico;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

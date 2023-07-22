package com.example.demo2.models.oftalmologico;

import com.example.demo2.enums.RespuestaEnum;
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
public class Oftalmologico {
    @Id
    @Column(name = "id_tejido_subcutaneo", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ojo_derecho", length = 200)
    private String ojoDerecho;

    @Column(name = "ojo_izquierdo", length = 200)
    private String ojoIzquierdo;

    @Column(name = "lentes_graduados")
    private RespuestaEnum lentesGraduados;

    @Column(name = "graduacion_lentes", length = 200)
    private String graduacionLentes;

    @Column(name = "distancia_para_ver")
    private Integer distanciaParaVer;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

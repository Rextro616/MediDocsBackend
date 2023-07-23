package com.example.demo2.models.exploracion;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.tipoExploracion.TipoExploracion;
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
public class Exploracion {

    @Id
    @Column(name = "id_exploracion", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String palpacion;

    @Column(length = 100)
    private String inspeccion;

    @Column(length = 100)
    private String percusion;

    @Column(length = 100)
    private String auscultacion;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_exploracion", nullable = false)
    private TipoExploracion tipoExploracion;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    private HistoriaClinica historiaClinica;
}

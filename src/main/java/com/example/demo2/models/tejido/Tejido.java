package com.example.demo2.models.tejido;

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
public class Tejido {
    @Id
    @Column(name = "id_tejido_subcutaneo", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String aspecto;

    @Column(name = "distribucion_pilosa", length = 200)
    private String distribucionPilosa;

    @Column(length = 200)
    private String lesiones;

    @Column(length = 200)
    private String faneras;

    @Column(name = "tejido_celular_subcutaneo", length = 200)
    private String tejidoCelularSubcutaneo;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

package com.example.demo2.models.cabeza;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Cabeza {
    @Id
    @Column(name = "id_cabeza", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "craneo_y_cara", length = 200)
    private String craneoCara;

    @Column(name = "cuero_cabelludo", length = 200)
    private String cueroCabelludo;

    @Column(name = "region_frontal", length = 200)
    private String regionFrontal;

    @Column(name = "region_orbitonasal", length = 200)
    private String regionOrbitonasal;

    @Column(name = "region_orofaringea", length = 200)
    private String regionOrofaringea;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;
}

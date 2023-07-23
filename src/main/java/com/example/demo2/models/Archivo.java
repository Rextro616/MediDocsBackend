package com.example.demo2.models;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Archivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String tipo;

    @Lob
    private byte[] contenido;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_historiaclinica")
    HistoriaClinica historiaClinica;


}

package com.example.demo2.models.inmunizaciones;

import com.example.demo2.models.paciente.Paciente;
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
public class Inmunizacion {
    @Id
    @Column(name = "id_inmunizaciones", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 40)
    private String nombre;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
}

package com.example.demo2.models.habitosFisiologicos;

import com.example.demo2.models.paciente.Paciente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class HabitoFisiologico {
    @Id
    @Column(name = "id_habitos_fisiologicos", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String alimentacion;

    @Column(nullable = false, length = 100)
    private String diuresis;

    @Column(nullable = false, length = 100)
    private String catarsis;

    @Column(nullable = false, length = 100)
    private String suenio;

    @Column(nullable = false, length = 100)
    private String sexualidad;

    @Column(nullable = false, length = 100)
    private String alergias;

    @Column(length = 100)
    private String otros;

    @JsonIgnore
    @OneToOne(mappedBy = "habitoFisiologico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente paciente;

}

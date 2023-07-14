package com.example.demo2.models.antecedentesHeredofamiliares;

import com.example.demo2.enums.RespuestaEnum;
import com.example.demo2.models.paciente.Paciente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedenteHeredofamiliar {
    @Id
    @Column(name = "id_antecedentes_heredofamiliares", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private RespuestaEnum diabetes;

    @Column(length = 20)
    private String diabetes_quien;

    @Column(nullable = false)
    private RespuestaEnum hipertencion;

    @Column(length = 20)
    private String hipertencion_quien;

    @Column(nullable = false)
    private RespuestaEnum cancer;

    @Column(length = 20)
    private String cancer_quien;

    @Column(length = 20)
    private String tipo_cancer;

    @Column(nullable = false)
    private RespuestaEnum cardiopatias;

    @Column(length = 20)
    private String cardiopatias_quien;

    @Column(nullable = false)
    private RespuestaEnum nefropatias;

    @Column(length = 20)
    private String nefropatias_quien;

    @Column(length = 50)
    private String malformaciones;

    @Column(length = 200)
    private String otros;

    @JsonIgnore
    @OneToOne(mappedBy = "antecedenteHeredofamiliar", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente paciente;

}

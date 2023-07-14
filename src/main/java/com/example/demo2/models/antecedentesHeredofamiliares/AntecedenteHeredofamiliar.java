package com.example.demo2.models.antecedentesHeredofamiliares;

import com.example.demo2.models.paciente.Paciente;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @Column(nullable = false)
    private char diabetes;

    @Column(length = 20)
    private String diabetes_quien;

    @Column(nullable = false)
    private char hipertencion;

    @Column(length = 20)
    private String hipertencion_quien;

    @Column(nullable = false)
    private char cancer;

    @Column(length = 20)
    private String cancer_quien;

    @Column(length = 20)
    private String tipo_cancer;

    @Column(nullable = false)
    private char cardiopatias;

    @Column(length = 20)
    private String cardiopatias_quien;

    @Column(nullable = false)
    private char nefropatias;

    @Column(length = 20)
    private String nefropatias_quien;

    @Column(length = 50)
    private String malformaciones;

    @Column(length = 200)
    private String otros;

}

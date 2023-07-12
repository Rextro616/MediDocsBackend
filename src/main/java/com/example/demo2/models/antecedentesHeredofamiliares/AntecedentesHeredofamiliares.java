package com.example.demo2.models.antecedentesHeredofamiliares;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class AntecedentesHeredofamiliares {
    @Id
    @Column(name = "id_antecedentes_heredofamiliares", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    private int id_paciente;
    private char diabetes;
    private String diabetes_quien;
    private char hipertencion;
    private String hipertencion_quien;
    private char cancer;
    private String cancer_quien;
    private String tipo_cancer;
    private char cardiopatias;
    private String cardiopatias_quien;
    private char nefropatias;
    private String nefropatias_quien;
    private String malformaciones;
    private String otros;

}

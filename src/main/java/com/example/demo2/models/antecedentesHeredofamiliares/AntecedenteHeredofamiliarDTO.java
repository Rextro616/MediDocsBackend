package com.example.demo2.models.antecedentesHeredofamiliares;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedenteHeredofamiliarDTO {
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

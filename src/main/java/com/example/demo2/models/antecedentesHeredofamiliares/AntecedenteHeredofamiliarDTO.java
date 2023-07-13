package com.example.demo2.models.antecedentesHeredofamiliares;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedenteHeredofamiliarDTO {

//    private PacienteDTO pacienteDTO;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private char diabetes;

    private String diabetes_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private char hipertencion;

    private String hipertencion_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private char cancer;

    private String cancer_quien;

    private String tipo_cancer;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private char cardiopatias;

    private String cardiopatias_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private char nefropatias;

    private String nefropatias_quien;

    private String malformaciones;

    private String otros;
}

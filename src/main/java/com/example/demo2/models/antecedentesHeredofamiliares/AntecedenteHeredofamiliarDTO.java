package com.example.demo2.models.antecedentesHeredofamiliares;

import com.example.demo2.enums.RespuestaEnum;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedenteHeredofamiliarDTO {

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private RespuestaEnum diabetes;

    private String diabetes_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private RespuestaEnum hipertencion;

    private String hipertencion_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private RespuestaEnum cancer;

    private String cancer_quien;

    private String tipo_cancer;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private RespuestaEnum cardiopatias;

    private String cardiopatias_quien;

    @NotBlank(message = "Se requiere un campo lleno")
    @Size(message = "Tamaño de 1 máximo", max = 10)
    private RespuestaEnum nefropatias;

    private String nefropatias_quien;

    private String malformaciones;

    private String otros;

    @JsonIgnore
    private PacienteDTO paciente;
}

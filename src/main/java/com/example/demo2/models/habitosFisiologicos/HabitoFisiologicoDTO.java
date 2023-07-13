package com.example.demo2.models.habitosFisiologicos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HabitoFisiologicoDTO {
    @NotBlank(message = "Se requiere llenar el campo de alimentacion >:(")
    private String alimentacion;
    @NotBlank(message = "Se requiere llenar el campo de diuresis >:(")
    private String diuresis;
    @NotBlank(message = "Se requiere llenar el campo de catarsis >:(")
    private String catarsis;
    @NotBlank(message = "Se requiere llenar el campo de suenio >:(")
    private String suenio;
    @NotBlank(message = "Se requiere llenar el campo de sexualidad >:(")
    private String sexualidad;
    @NotBlank(message = "Se requiere llenar el campo de alergias >:(")
    private String alergias;
    private String otros;
}
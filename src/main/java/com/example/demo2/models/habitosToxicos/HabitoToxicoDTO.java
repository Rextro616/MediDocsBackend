package com.example.demo2.models.habitosToxicos;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HabitoToxicoDTO {
    @NotBlank(message = "Se requiere llenar el campo de alcohol >:(")
    private String alcohol;

    @NotBlank(message = "Se requiere llenar el campo de tabaco >:(")
    private String tabaco;

    @NotBlank(message = "Se requiere llenar el campo de drogas >:(")
    private String drogas;

    @NotBlank(message = "Se requiere llenar el campo de infusiones >:(")
    private String infusiones;

    @NotBlank(message = "Se requiere el campo de actividad fisica >:(")
    private String actividad_fisica;

    @JsonIgnore
    private PacienteDTO paciente;



}

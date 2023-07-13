package com.example.demo2.models.habitosToxicos;

import com.example.demo2.models.antecedentesPersonales.AntecedentePersonal;
import com.example.demo2.models.antecedentesPersonales.AntecedentePersonalDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HabitoToxicoDTO {
    @NotNull(message = "Se requiere llenar el campo de alcohol >:(")
    private String alcohol;
    @NotNull(message = "Se requiere llenar el campo de tabaco >:(")
    private String tabaco;
    @NotNull(message = "Se requiere llenar el campo de drogas >:(")
    private String drogas;
    @NotNull(message = "Se requiere llenar el campo de infusiones >:(")
    private String infusiones;
    @NotNull(message = "Se requiere el campo de actividad fisica >:(")
    private String actividad_fisica;
    private AntecedentePersonalDTO antecedentePersonalDTO;
}

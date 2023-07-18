package com.example.demo2.models.enfermedad;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
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
public class EnfermedadDTO {
    @NotNull(message = "Se requiere un tipo de enfermedad >:(")
    private TipoEnfermedad tipoEnfermedad;

    @JsonIgnore
    private Paciente paciente;

    @NotBlank(message = "Se requiere un nombre de la enfermedad >:(")
    private String nombreEnfermedad;

    @NotBlank(message = "Se requiere medicación >:(")
    private String medicacion;
}

package com.example.demo2.models.enfermedad;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
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
    private int tipoEnfermedad;
    @NotNull(message = "Se requiere un paciente >:(")
    private Paciente paciente;
    @NotBlank(message = "Se requiere un nombre de la enfermedad >:(")
    private String nombreEnfermedad;
    @NotBlank(message = "Se requiere medicación >:(")
    private String medicacion;
}

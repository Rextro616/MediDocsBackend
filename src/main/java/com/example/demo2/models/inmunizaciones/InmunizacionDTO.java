package com.example.demo2.models.inmunizaciones;

import com.example.demo2.models.paciente.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class InmunizacionDTO {
    @NotBlank(message = "Se requiere un nombre de la enfermedad >:(")
    private String nombre;

    @JsonIgnore
    private Paciente paciente;

}

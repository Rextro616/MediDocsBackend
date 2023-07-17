package com.example.demo2.models.medico;

import com.example.demo2.models.usuario.Usuario;
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
public class MedicoDTO {
    @NotNull(message = "Se requiere un usuario >:(")
    private Usuario usuario;

    @NotBlank(message = "Se requiere cedula >:(")
    private String cedula;

    private String especialidad;
}

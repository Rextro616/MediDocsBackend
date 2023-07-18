package com.example.demo2.models.medico;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.models.usuario.UsuarioDTO;
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
public class MedicoDTO {
    private Integer id;
    @NotNull(message = "Se requiere un usuario >:(")
    private UsuarioDTO usuario;

    @NotBlank(message = "Se requiere cedula >:(")
    private String cedula;

    private String especialidad;

    @JsonIgnore
    private PacienteDTO paciente;

}

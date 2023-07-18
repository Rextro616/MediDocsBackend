package com.example.demo2.models.usuario;

import com.example.demo2.enums.SexoEnum;
import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.medico.MedicoDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UsuarioDTO {
    @NotBlank(message = "Se requiere un usuario >:(")
    private String usuario;

    @NotBlank(message = "Se requiere una contraseña >:(")
    private String usuarioContrasenia;

    @NotBlank(message = "Se requiere un nombre >:(")
    private String nombre;

    @NotBlank(message = "Se requiere apellido paterno >:(")
    private String apellidoPaterno;

    @NotBlank(message = "Se requiere apellido materno >:(")
    private String apellidoMaterno;

    @NotNull(message = "Se requiere un sexo >:(")
    private SexoEnum sexo;
    @NotBlank(message = "Se requiere una fecha de nacimiento >:(")
    private Date fechaNacimiento;

    @NotBlank(message = "Se requiere un correo electronico >:(")
    private String correoElectronico;

    @JsonIgnore
    private MedicoDTO medico;
}

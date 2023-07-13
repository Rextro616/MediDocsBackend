package com.example.demo2.models.paciente;

import com.example.demo2.enums.EstadoCivilEnum;
import com.example.demo2.enums.NacionalidadEnum;
import com.example.demo2.enums.SexoEnum;
import com.example.demo2.enums.TipoSangreEnum;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PacienteDTO {
    @NotBlank(message = "Se requiere ocupación >:(")
    private String ocupacion;

    @NotNull(message = "Se requiere estado civil >:(")
    private EstadoCivilEnum estadoCivil;

    @NotNull(message = "Se requiere nacionalidad >:(")
    private NacionalidadEnum nacionalidad;

    @NotNull(message = "Se requiere tipo de sangre >:(")
    private TipoSangreEnum tipoSangre;

    @NotBlank(message = "Se requiere telefono >:(")
    @Size(message = "Tamaño de 10 dígitos requerido", max = 10, min = 10)
    private String telefono;

    @NotBlank(message = "Se requiere domicilio >:(")
    private String domicilio;

    @NotBlank(message = "Se requiere nombre >:(")
    private String nombre;

    @NotBlank(message = "Se requiere apellido paterno >:(")
    private String apellidoPaterno;

    @NotBlank(message = "Se requiere apellido materno >:(")
    private String apellidoMaterno;

    @NotNull(message = "Se requiere sexo >:(")
    private SexoEnum sexo;

    @NotNull(message = "Se requiere fecha de nacimiento >:(")
    private Date fechaNacimiento;

    @NotBlank(message = "Se requiere correo electronico >:(")
    private String correoElectronico;

//    @NotBlank(message = "Se requiere un antecedente personal >:(")
//    private AntecedentePersonalDTO antecedentePersonal;
    @NotNull(message = "Se requiere un antecedente heredofamiliar >:(")
    private AntecedenteHeredofamiliarDTO antecedenteHeredofamiliarDTO;

}

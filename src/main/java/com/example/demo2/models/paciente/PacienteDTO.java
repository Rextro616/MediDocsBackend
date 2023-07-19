package com.example.demo2.models.paciente;

import com.example.demo2.enums.EstadoCivilEnum;
import com.example.demo2.enums.NacionalidadEnum;
import com.example.demo2.enums.SexoEnum;
import com.example.demo2.enums.TipoSangreEnum;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.enfermedad.EnfermedadDTO;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologicoDTO;
import com.example.demo2.models.habitosToxicos.HabitoToxicoDTO;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.models.inmunizaciones.InmunizacionDTO;
import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.medico.MedicoDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PacienteDTO {
    private Integer Id;
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

    @NotNull(message = "Se requiere un habito fisiológico >:(")
    private HabitoFisiologicoDTO habitoFisiologico;

    @NotNull(message = "Se requiere un habito tóxico >:(")
    private HabitoToxicoDTO habitoToxico;

    @NotNull(message = "Se requiere un antecedente heredofamiliar >:(")
    private AntecedenteHeredofamiliarDTO antecedenteHeredofamiliar;

    private List<EnfermedadDTO> enfermedad;
    private List<InmunizacionDTO> inmunizacion;

    @NotNull(message = "Se requiere un medico >:(")
    private MedicoDTO medico;

    @JsonIgnore
    private List<HistoriaClinicaDTO> historiaClinicaDTO;

}

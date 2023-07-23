package com.example.demo2.models.historiaClinica;

import com.example.demo2.models.Archivo;
import com.example.demo2.models.cabeza.CabezaDTO;
import com.example.demo2.models.electrocardiograma.ElectrocardiogramaDTO;
import com.example.demo2.models.examenFisico.ExamenFisicoDTO;
import com.example.demo2.models.exploracion.ExploracionDTO;
import com.example.demo2.models.laboratorio.LaboratorioDTO;
import com.example.demo2.models.neurologico.NeurologicoDTO;
import com.example.demo2.models.oftalmologico.OftalmologicoDTO;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.models.sinromatico.SindromaticoDTO;
import com.example.demo2.models.tejido.TejidoDTO;
import com.example.demo2.models.torax.ToraxDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HistoriaClinicaDTO {
    @NotBlank(message = "Se requiere llenar el campo de fecha >:(")
    private Date fecha;

    @NotBlank(message = "Se requiere llenar el campo motivo de consulta >:(")
    private String motivoConsulta;

    @NotBlank(message = "Se requiere llenar el campo de enfermedad actual >:(")
    private String enfermedadActual;

    private String antecenentesEnfermedadActual;

    private String diagnosticosDiferenciales;

    private String planDiagnostico;

    private String planTerapeutico;

    @NotBlank(message = "Se requiere llenar el campo de paciente >:(")
    private PacienteDTO paciente;

    private ExamenFisicoDTO examenFisico;

    private TejidoDTO tejido;

    private CabezaDTO cabeza;

    private OftalmologicoDTO oftalmologico;

    private List<ExploracionDTO> exploracion;

    private NeurologicoDTO neurologico;

    private LaboratorioDTO laboratorioDTO;

    private ElectrocardiogramaDTO electrocardiograma;

    private ToraxDTO torax;

    private SindromaticoDTO sindromatico;

    private List<Archivo> archivo;
}

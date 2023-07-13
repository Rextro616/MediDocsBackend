package com.example.demo2.services;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;
    AntecedenteHeredofamiliarService antecedenteHeredofamiliarService;

    public List<PacienteDTO> getAll() {
        List<Paciente> pacienteList = pacienteRepository.findAll();
        List<PacienteDTO> pacienteDTOList = new ArrayList<>();

        pacienteList.forEach(paciente -> {
            PacienteDTO pacienteDTO = PacienteDTO.builder()
                    .nombre(paciente.getNombre())
                    .apellidoPaterno(paciente.getApellidoPaterno())
                    .apellidoMaterno(paciente.getApellidoMaterno())
                    .ocupacion(paciente.getOcupacion())
                    .sexo(paciente.getSexo())
                    .correoElectronico(paciente.getCorreoElectronico())
                    .domicilio(paciente.getDomicilio())
                    .estadoCivil(paciente.getEstadoCivil())
                    .fechaNacimiento(paciente.getFechaNacimiento())
                    .nacionalidad(paciente.getNacionalidad())
                    .tipoSangre(paciente.getTipoSangre())
                    .telefono(paciente.getTelefono())
                    .antecedenteHeredofamiliarDTO(antecedenteHeredofamiliarService.getById(paciente.getAntecedenteHeredofamiliar().getId()))
                    .build();

            pacienteDTOList.add(pacienteDTO);
        });

        return pacienteDTOList;
    }

    public Boolean postPaciente(PacienteDTO pacienteDTO) {
        AntecedenteHeredofamiliarDTO antecedenteHeredofamiliarDTO = pacienteDTO.getAntecedenteHeredofamiliarDTO();
        AntecedenteHeredofamiliar antecedenteHeredofamiliar = AntecedenteHeredofamiliar.builder()
                .cancer(antecedenteHeredofamiliarDTO.getCancer())
                .cancer_quien(antecedenteHeredofamiliarDTO.getCancer_quien())
                .tipo_cancer(antecedenteHeredofamiliarDTO.getTipo_cancer())
                .cardiopatias(antecedenteHeredofamiliarDTO.getCardiopatias())
                .cardiopatias_quien(antecedenteHeredofamiliarDTO.getCardiopatias_quien())
                .diabetes(antecedenteHeredofamiliarDTO.getDiabetes())
                .diabetes_quien(antecedenteHeredofamiliarDTO.getDiabetes_quien())
                .hipertencion(antecedenteHeredofamiliarDTO.getHipertencion())
                .hipertencion_quien(antecedenteHeredofamiliarDTO.getHipertencion_quien())
                .nefropatias(antecedenteHeredofamiliarDTO.getNefropatias())
                .nefropatias_quien(antecedenteHeredofamiliarDTO.getNefropatias_quien())
                .malformaciones(antecedenteHeredofamiliarDTO.getMalformaciones())
                .otros(antecedenteHeredofamiliarDTO.getOtros())
                .build();

        Paciente paciente = Paciente.builder()
                .nombre(pacienteDTO.getNombre())
                .apellidoPaterno(pacienteDTO.getApellidoPaterno())
                .apellidoMaterno(pacienteDTO.getApellidoMaterno())
                .ocupacion(pacienteDTO.getOcupacion())
                .sexo(pacienteDTO.getSexo())
                .correoElectronico(pacienteDTO.getCorreoElectronico())
                .domicilio(pacienteDTO.getDomicilio())
                .estadoCivil(pacienteDTO.getEstadoCivil())
                .fechaNacimiento(pacienteDTO.getFechaNacimiento())
                .nacionalidad(pacienteDTO.getNacionalidad())
                .tipoSangre(pacienteDTO.getTipoSangre())
                .telefono(pacienteDTO.getTelefono())
                .build();
        paciente.setAntecedenteHeredofamiliar(antecedenteHeredofamiliar);

        return Objects.nonNull(pacienteRepository.save(paciente));
    }
}

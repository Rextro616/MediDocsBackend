package com.example.demo2.services;

import com.example.demo2.models.antecedentesPersonales.AntecedentePersonal;
import com.example.demo2.models.antecedentesPersonales.AntecedentePersonalDTO;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologicoDTO;
import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.habitosToxicos.HabitoToxicoDTO;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.repository.AntecedentePersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AntecedentePersonalService {
    @Autowired
    AntecedentePersonalRepository antecedentePersonalRepository;

    public Boolean saveAntecendente(AntecedentePersonalDTO antecedentePersonalDTO){
        AntecedentePersonal antecedentePersonal = AntecedentePersonal.builder().build();
//        PacienteDTO pacienteDTO = antecedentePersonalDTO.getPacienteDTO();
        PacienteDTO pacienteDTO = null;
        HabitoToxicoDTO habitoToxicoDTO = antecedentePersonalDTO.getHabitoToxicoDTO();
        HabitoFisiologicoDTO habitoFisiologicoDTO = antecedentePersonalDTO.getHabitoFisiologicoDTO();

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

        HabitoToxico habitoToxico = HabitoToxico.builder()
                .alcohol(habitoToxicoDTO.getAlcohol())
                .actividad_fisica(habitoToxicoDTO.getActividad_fisica())
                .drogas(habitoToxicoDTO.getDrogas())
                .tabaco(habitoToxicoDTO.getTabaco())
                .infusiones(habitoToxicoDTO.getInfusiones())
                .build();

        HabitoFisiologico habitoFisiologico = HabitoFisiologico.builder()
                .alergias(habitoFisiologicoDTO.getAlergias())
                .otros(habitoFisiologicoDTO.getOtros())
                .alimentacion(habitoFisiologicoDTO.getAlimentacion())
                .catarsis(habitoFisiologicoDTO.getCatarsis())
                .diuresis(habitoFisiologicoDTO.getDiuresis())
                .suenio(habitoFisiologicoDTO.getSuenio())
                .sexualidad(habitoFisiologicoDTO.getSexualidad())
                .build();

        antecedentePersonal.setHabitoFisiologico(habitoFisiologico);
        antecedentePersonal.setPaciente(paciente);
        antecedentePersonal.setHabitoToxico(habitoToxico);

        return Objects.nonNull(antecedentePersonalRepository.save(antecedentePersonal));
    }


    public AntecedentePersonalDTO getById(Integer id) {
        AntecedentePersonal antecedentePersonal = antecedentePersonalRepository.findById(id).get();
        HabitoToxico habitoToxico = antecedentePersonal.getHabitoToxico();
        Paciente paciente = antecedentePersonal.getPaciente();
        HabitoFisiologico habitoFisiologico = antecedentePersonal.getHabitoFisiologico();

        HabitoToxicoDTO habitoToxicoDTO = HabitoToxicoDTO.builder()
                .alcohol(habitoToxico.getAlcohol())
                .actividad_fisica(habitoToxico.getActividad_fisica())
                .drogas(habitoToxico.getDrogas())
                .tabaco(habitoToxico.getTabaco())
                .infusiones(habitoToxico.getInfusiones())
                .build();

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
                .build();

        HabitoFisiologicoDTO habitoFisiologicoDTO = HabitoFisiologicoDTO.builder()
                .alergias(habitoFisiologico.getAlergias())
                .otros(habitoFisiologico.getOtros())
                .alimentacion(habitoFisiologico.getAlimentacion())
                .catarsis(habitoFisiologico.getCatarsis())
                .diuresis(habitoFisiologico.getDiuresis())
                .suenio(habitoFisiologico.getSuenio())
                .sexualidad(habitoFisiologico.getSexualidad())
                .build();

        AntecedentePersonalDTO antecedentePersonalDTO = AntecedentePersonalDTO.builder()
                .habitoToxicoDTO(habitoToxicoDTO)
//                .pacienteDTO(pacienteDTO)
                .habitoFisiologicoDTO(habitoFisiologicoDTO)
                .build();

        return antecedentePersonalDTO;
    }
}

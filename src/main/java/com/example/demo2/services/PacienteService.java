package com.example.demo2.services;

import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.medico.MedicoDTO;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    TipoEnfermedadRepository tipoEnfermedadRepository;

    public Optional<Paciente> getById(Integer id){
        return  pacienteRepository.findById(id);
    }

    public List<PacienteDTO> getAll(Integer idMedico) {
        Medico medico = medicoRepository.getById(idMedico);
        List<PacienteDTO> pacienteDTOS = new ArrayList<>();
        medico.getPaciente().forEach(paciente -> {
            pacienteDTOS.add(modelMapper.map(paciente, PacienteDTO.class));
        });

        return pacienteDTOS;
    }
    @Transactional
    public Boolean postPaciente(PacienteDTO pacienteDTO) {
        if (pacienteRepository.validarPaciente(pacienteDTO.getCorreoElectronico(), pacienteDTO.getTelefono()) == null) {
            //enfermedades y sus tipos
            Paciente paciente = modelMapper.map(pacienteDTO, Paciente.class);
            if (paciente.getEnfermedad() != null){
                paciente.getEnfermedad().forEach(enfermedad -> enfermedad.setTipoEnfermedad(tipoEnfermedadRepository.getById(enfermedad.getTipoEnfermedad().getId())));
            }
            //medico
            Medico medico = medicoRepository.getById(paciente.getMedico().getId());
            paciente.setMedico(medico);
            pacienteRepository.save(paciente);

            if (paciente.getInmunizacion() != null){
                paciente.getInmunizacion().forEach(inmunizacion -> inmunizacion.setPaciente(paciente));
            }
            if (paciente.getEnfermedad() != null){
                paciente.getEnfermedad().forEach(enfermedad -> enfermedad.setPaciente(paciente));
            }
            medico.getPaciente().add(paciente);

            return true;
        }
        return false;
    }
}

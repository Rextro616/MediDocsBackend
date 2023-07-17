package com.example.demo2.services;

import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    ModelMapper modelMapper;
    public Optional<Paciente> getById(Integer id){
        return  pacienteRepository.findById(id);
    }

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }
    @Transactional
    public Boolean postPaciente(PacienteDTO pacienteDTO) {
        if (pacienteRepository.validarPaciente(pacienteDTO.getCorreoElectronico(), pacienteDTO.getTelefono()) == null) {
            Paciente paciente = modelMapper.map(pacienteDTO, Paciente.class);
            pacienteRepository.save(paciente);

            paciente.getEnfermedad().forEach(enfermedad -> enfermedad.setPaciente(paciente));
            return true;
        }
        return false;
    }
}

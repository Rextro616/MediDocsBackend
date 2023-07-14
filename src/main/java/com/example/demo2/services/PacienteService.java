package com.example.demo2.services;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    AntecedenteHeredofamiliarRepository antecedenteHeredofamiliarRepository;
    @Autowired
    HabitoToxicoRepository habitoToxicoRepository;
    @Autowired
    HabitoFisiologicoRepository habitoFisiologicoRepository;
    @Autowired
    ModelMapper modelMapper;

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }
    @Transactional
    public Boolean postPaciente(PacienteDTO pacienteDTO) {

        Paciente paciente = modelMapper.map(pacienteDTO,Paciente.class);
        //pacienteRepository.save(paciente1);


        //AntecedenteHeredofamiliar antecedenteHeredofamiliar = paciente1.getAntecedenteHeredofamiliar();
        //antecedenteHeredofamiliar.setPaciente(paciente1);
        //antecedenteHeredofamiliarRepository.save(antecedenteHeredofamiliar);

        //HabitoToxico habitoToxico = paciente1.getHabitoToxico();
        //habitoToxico.setPaciente(paciente1);
        //habitoToxicoRepository.save(habitoToxico);

        //HabitoFisiologico habitoFisiologico = paciente1.getHabitoFisiologico();
        //habitoFisiologico.setPaciente(paciente1);
        //habitoFisiologicoRepository.save(habitoFisiologico);
        pacienteRepository.save(paciente);

        return true;
    }
}

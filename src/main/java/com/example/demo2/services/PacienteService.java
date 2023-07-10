package com.example.demo2.services;

import com.example.demo2.models.Paciente;
import com.example.demo2.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }
}

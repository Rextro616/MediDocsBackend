package com.example.demo2.services;

import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.repository.ExamenFisicoRepository;
import com.example.demo2.repository.HistoriaClinicaRepository;
import com.example.demo2.repository.PacienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.*;
import java.util.List;

@Service
public class HistoriaClinicaService {
    @Autowired
    HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    ExamenFisicoRepository examenFisicoRepository;

    public Boolean postHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO){
        HistoriaClinica historiaClinica = new HistoriaClinica();
        historiaClinica = modelMapper.map(historiaClinicaDTO, HistoriaClinica.class);
        //paciente
        historiaClinica.setPaciente(pacienteRepository.getById(historiaClinica.getPaciente().getId()));
        historiaClinicaRepository.save(historiaClinica);
        historiaClinica.getPaciente().getHistoriaClinica().add(historiaClinica);
        //examen fisico
        ExamenFisico fisico = historiaClinica.getExamenFisico();
        fisico.setHistoriaClinica(historiaClinica);
        examenFisicoRepository.save(fisico);

        return true;
    }



    public List<HistoriaClinicaDTO> getById(Integer id, String opcion){
        List<HistoriaClinicaDTO> listaPorId = new ArrayList<>();

        if (opcion.equals("MEDICO")){
            historiaClinicaRepository.findAll().forEach(historiaClinica -> {
                if (historiaClinica.getPaciente().getMedico().getId() == id){
                    listaPorId.add(modelMapper.map(historiaClinica, HistoriaClinicaDTO.class));
                }
            });
        } else if (opcion.equals("PACIENTE")) {
            historiaClinicaRepository.findAllById(Collections.singleton(id)).forEach(historiaClinica -> listaPorId.add(modelMapper.map(historiaClinica, HistoriaClinicaDTO.class)));
        }

        return listaPorId;
    }

    public List<HistoriaClinica> get() {
        return historiaClinicaRepository.findAll();
    }
}

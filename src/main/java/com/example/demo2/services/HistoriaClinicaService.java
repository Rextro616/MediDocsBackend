package com.example.demo2.services;

import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.models.oftalmologico.Oftalmologico;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.models.tejido.Tejido;
import com.example.demo2.repository.*;
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

    @Autowired
    TejidoRepository tejidoRepository;

    @Autowired
    CabezaRepository cabezaRepository;

    @Autowired
    OftalmologicoRepository oftalmologicoRepository;

    public Boolean postHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO){
        HistoriaClinica historiaClinica = new HistoriaClinica();
        historiaClinica = modelMapper.map(historiaClinicaDTO, HistoriaClinica.class);
        //paciente
        historiaClinica.setPaciente(pacienteRepository.getById(historiaClinica.getPaciente().getId()));
        historiaClinicaRepository.save(historiaClinica);
        historiaClinica.getPaciente().getHistoriaClinica().add(historiaClinica);
        //examen fisico
        ExamenFisico fisico = historiaClinica.getExamenFisico();
        if (fisico != null){
            fisico.setHistoriaClinica(historiaClinica);
            examenFisicoRepository.save(fisico);
        }
        //tejido
        Tejido tejido = historiaClinica.getTejido();
        if (tejido != null){
            tejido.setHistoriaClinica(historiaClinica);
            tejidoRepository.save(tejido);
        }
        //cabeza
        Cabeza cabeza = historiaClinica.getCabeza();
        if (cabeza != null){
            cabeza.setHistoriaClinica(historiaClinica);
            cabezaRepository.save(cabeza);
        }
        //oftalmologico
        Oftalmologico oftalmologico = historiaClinica.getOftalmologico();
        if (oftalmologico != null){
            oftalmologico.setHistoriaClinica(historiaClinica);
            oftalmologicoRepository.save(oftalmologico);
        }


        return true;
    }

    public List<HistoriaClinicaDTO> getById(Integer id){
        List<HistoriaClinicaDTO> listaPorId = new ArrayList<>();
        Paciente paciente = pacienteRepository.getById(id);

        paciente.getHistoriaClinica().forEach(historiaClinica -> listaPorId.add(modelMapper.map(historiaClinica, HistoriaClinicaDTO.class)));

        return listaPorId;
    }

    public List<HistoriaClinica> get() {
        return historiaClinicaRepository.findAll();
    }
}

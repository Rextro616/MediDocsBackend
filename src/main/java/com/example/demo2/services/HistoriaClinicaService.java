package com.example.demo2.services;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.repository.HistoriaClinicaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HistoriaClinicaService {
    @Autowired
    HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    ModelMapper modelMapper;

    public Boolean postHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO){
        HistoriaClinica historiaClinica = modelMapper.map(historiaClinicaDTO, HistoriaClinica.class);
        return Objects.nonNull(historiaClinicaRepository.save(historiaClinica));
    }
}

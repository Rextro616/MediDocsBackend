package com.example.demo2.services;

import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.examenFisico.ExamenFisicoDTO;
import com.example.demo2.repository.ExamenFisicoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class ExamenFisicoService {
    @Autowired
    ExamenFisicoRepository examenFisicoRepository;

    @Autowired
    ModelMapper modelMapper;

    public Boolean post(ExamenFisicoDTO examenFisicoDTO){
        ExamenFisico examenFisico = modelMapper.map(examenFisicoDTO, ExamenFisico.class);
        examenFisicoRepository.save(examenFisico);

        return true;
    }
}

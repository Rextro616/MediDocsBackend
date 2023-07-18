package com.example.demo2.services;

import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.enfermedad.EnfermedadDTO;
import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
import com.example.demo2.repository.EnfermedadRepository;
import com.example.demo2.repository.TipoEnfermedadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EnfermedadService {
    @Autowired
    EnfermedadRepository enfermedadRepository;

    @Autowired
    TipoEnfermedadRepository tipoEnfermedadRepository;

    @Autowired
    ModelMapper modelMapper;

    public Enfermedad post(EnfermedadDTO enfermedadDTO){
        Enfermedad enfermedad = modelMapper.map(enfermedadDTO, Enfermedad.class);
        enfermedad.setTipoEnfermedad(tipoEnfermedadRepository.getById(enfermedad.getTipoEnfermedad().getId()));

        return enfermedadRepository.save(enfermedad);
    }

}

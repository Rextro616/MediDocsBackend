package com.example.demo2.services;

import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.enfermedad.EnfermedadDTO;
import com.example.demo2.repository.EnfermedadRepository;
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
    ModelMapper modelMapper;

    public Boolean post(EnfermedadDTO enfermedadDTO){
        Enfermedad enfermedad = modelMapper.map(enfermedadDTO, Enfermedad.class);
        return Objects.nonNull(enfermedadRepository.save(enfermedad));
    }

}

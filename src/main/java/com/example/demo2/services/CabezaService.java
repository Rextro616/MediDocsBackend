package com.example.demo2.services;

import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.models.cabeza.CabezaDTO;
import com.example.demo2.repository.CabezaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabezaService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CabezaRepository cabezaRepository;

    public Boolean post(CabezaDTO cabezaDTO){
        Cabeza cabeza = modelMapper.map(cabezaDTO, Cabeza.class);
        cabezaRepository.save(cabeza);
        return true;
    }
}

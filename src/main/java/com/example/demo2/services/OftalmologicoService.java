package com.example.demo2.services;

import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.models.cabeza.CabezaDTO;
import com.example.demo2.models.oftalmologico.Oftalmologico;
import com.example.demo2.models.oftalmologico.OftalmologicoDTO;
import com.example.demo2.repository.OftalmologicoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OftalmologicoService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    OftalmologicoRepository oftalmologicoRepository;

    public Boolean post(OftalmologicoDTO oftalmologicoDTO){
        Oftalmologico oftalmologico = modelMapper.map(oftalmologicoDTO, Oftalmologico.class);
        oftalmologicoRepository.save(oftalmologico);
        return true;
    }
}

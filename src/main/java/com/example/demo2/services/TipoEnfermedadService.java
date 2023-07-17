package com.example.demo2.services;

import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
import com.example.demo2.repository.TipoEnfermedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEnfermedadService {
    @Autowired
    TipoEnfermedadRepository tipoEnfermedadRepository;
    public List<TipoEnfermedad> getAll(){
        return tipoEnfermedadRepository.findAll();
    }

}

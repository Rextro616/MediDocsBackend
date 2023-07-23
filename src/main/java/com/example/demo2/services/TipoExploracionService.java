package com.example.demo2.services;

import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
import com.example.demo2.models.tipoExploracion.TipoExploracion;
import com.example.demo2.repository.TipoExploracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoExploracionService {
    @Autowired
    TipoExploracionRepository tipoExploracionRepository;

    public List<TipoExploracion> get(){
        return tipoExploracionRepository.findAll();
    }
}

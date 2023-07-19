package com.example.demo2.services;

import com.example.demo2.models.tejido.Tejido;
import com.example.demo2.models.tejido.TejidoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TejidoService {
    @Autowired
    ModelMapper modelMapper;
    public Boolean post(TejidoDTO tejidoDTO){
        Tejido tejido = modelMapper.map(tejidoDTO, Tejido.class);

        return true;
    }
}

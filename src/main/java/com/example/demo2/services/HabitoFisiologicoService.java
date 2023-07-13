package com.example.demo2.services;

import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologicoDTO;
import com.example.demo2.repository.HabitoFisiologicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HabitoFisiologicoService {
    @Autowired
    HabitoFisiologicoRepository habitoFisiologicoRepository;

    public Boolean postHabitos(HabitoFisiologicoDTO habitoFisiologicoDTO){
        HabitoFisiologico habitoFisiologico = HabitoFisiologico.builder()
                .alergias(habitoFisiologicoDTO.getAlergias())
                .otros(habitoFisiologicoDTO.getOtros())
                .alimentacion(habitoFisiologicoDTO.getAlimentacion())
                .catarsis(habitoFisiologicoDTO.getCatarsis())
                .diuresis(habitoFisiologicoDTO.getDiuresis())
                .suenio(habitoFisiologicoDTO.getSuenio())
                .sexualidad(habitoFisiologicoDTO.getSexualidad())
                .build();

        return Objects.nonNull(habitoFisiologicoRepository.save(habitoFisiologico));
    }
}

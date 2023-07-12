package com.example.demo2.services;

import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.habitosToxicos.HabitoToxicoDTO;
import com.example.demo2.repository.HabitoToxicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HabitoToxicoService {
    @Autowired
    HabitoToxicoRepository habitosToxicosRepository;

    public boolean postHabitoToxico(HabitoToxicoDTO habitoToxicoDTO){
        HabitoToxico habitoToxico = HabitoToxico.builder()
                .alcohol(habitoToxicoDTO.getAlcohol())
                .actividad_fisica(habitoToxicoDTO.getActividad_fisica())
                .drogas(habitoToxicoDTO.getDrogas())
                .tabaco(habitoToxicoDTO.getTabaco())
                .infusiones(habitoToxicoDTO.getInfusiones())
                .build();

        return Objects.nonNull(habitosToxicosRepository.save(habitoToxico));
    }
}

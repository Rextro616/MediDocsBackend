package com.example.demo2.services;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.repository.AntecedenteHeredofamiliarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AntecedenteHeredofamiliarService {
    @Autowired
    AntecedenteHeredofamiliarRepository antecedentesHeredofamiliaresRepository;
    public Boolean saveAntecendente(AntecedenteHeredofamiliarDTO antecedenteHeredofamiliarDTO) {
        AntecedenteHeredofamiliar antecedenteHeredofamiliar = AntecedenteHeredofamiliar.builder()
                .cancer(antecedenteHeredofamiliarDTO.getCancer())
                .cancer_quien(antecedenteHeredofamiliarDTO.getCancer_quien())
                .tipo_cancer(antecedenteHeredofamiliarDTO.getTipo_cancer())
                .cardiopatias(antecedenteHeredofamiliarDTO.getCardiopatias())
                .cardiopatias_quien(antecedenteHeredofamiliarDTO.getCardiopatias_quien())
                .diabetes(antecedenteHeredofamiliarDTO.getDiabetes())
                .diabetes_quien(antecedenteHeredofamiliarDTO.getDiabetes_quien())
                .hipertencion(antecedenteHeredofamiliarDTO.getHipertencion())
                .hipertencion_quien(antecedenteHeredofamiliarDTO.getHipertencion_quien())
                .nefropatias(antecedenteHeredofamiliarDTO.getNefropatias())
                .nefropatias_quien(antecedenteHeredofamiliarDTO.getNefropatias_quien())
                .malformaciones(antecedenteHeredofamiliarDTO.getMalformaciones())
                .otros(antecedenteHeredofamiliarDTO.getOtros())
                .build();

        return Objects.nonNull(antecedentesHeredofamiliaresRepository.save(antecedenteHeredofamiliar));
    }

    public List<AntecedenteHeredofamiliarDTO> getAll() {
        List<AntecedenteHeredofamiliar> antecedenteHeredofamiliarList = antecedentesHeredofamiliaresRepository.findAll();
        List<AntecedenteHeredofamiliarDTO> antecedenteHeredofamiliarDTOList = new ArrayList<>();

        antecedenteHeredofamiliarList.forEach(antecedenteHeredofamiliar -> {
            AntecedenteHeredofamiliarDTO antecedenteHeredofamiliarDTO = AntecedenteHeredofamiliarDTO.builder()
                    .cancer(antecedenteHeredofamiliar.getCancer())
                    .cancer_quien(antecedenteHeredofamiliar.getCancer_quien())
                    .tipo_cancer(antecedenteHeredofamiliar.getTipo_cancer())
                    .cardiopatias(antecedenteHeredofamiliar.getCardiopatias())
                    .cardiopatias_quien(antecedenteHeredofamiliar.getCardiopatias_quien())
                    .diabetes(antecedenteHeredofamiliar.getDiabetes())
                    .diabetes_quien(antecedenteHeredofamiliar.getDiabetes_quien())
                    .hipertencion(antecedenteHeredofamiliar.getHipertencion())
                    .hipertencion_quien(antecedenteHeredofamiliar.getHipertencion_quien())
                    .nefropatias(antecedenteHeredofamiliar.getNefropatias())
                    .nefropatias_quien(antecedenteHeredofamiliar.getNefropatias_quien())
                    .malformaciones(antecedenteHeredofamiliar.getMalformaciones())
                    .otros(antecedenteHeredofamiliar.getOtros())
                    .build();

            antecedenteHeredofamiliarDTOList.add(antecedenteHeredofamiliarDTO);
        });

        return antecedenteHeredofamiliarDTOList;
    }

    public AntecedenteHeredofamiliarDTO getById(Integer id) {
        AntecedenteHeredofamiliar antecedenteHeredofamiliar = antecedentesHeredofamiliaresRepository.findById(id).get();

            AntecedenteHeredofamiliarDTO antecedenteHeredofamiliarDTO = AntecedenteHeredofamiliarDTO.builder()
                    .cancer(antecedenteHeredofamiliar.getCancer())
                    .cancer_quien(antecedenteHeredofamiliar.getCancer_quien())
                    .tipo_cancer(antecedenteHeredofamiliar.getTipo_cancer())
                    .cardiopatias(antecedenteHeredofamiliar.getCardiopatias())
                    .cardiopatias_quien(antecedenteHeredofamiliar.getCardiopatias_quien())
                    .diabetes(antecedenteHeredofamiliar.getDiabetes())
                    .diabetes_quien(antecedenteHeredofamiliar.getDiabetes_quien())
                    .hipertencion(antecedenteHeredofamiliar.getHipertencion())
                    .hipertencion_quien(antecedenteHeredofamiliar.getHipertencion_quien())
                    .nefropatias(antecedenteHeredofamiliar.getNefropatias())
                    .nefropatias_quien(antecedenteHeredofamiliar.getNefropatias_quien())
                    .malformaciones(antecedenteHeredofamiliar.getMalformaciones())
                    .otros(antecedenteHeredofamiliar.getOtros())
                    .build();



        return antecedenteHeredofamiliarDTO;
    }
}

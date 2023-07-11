package com.example.demo2.services;

import com.example.demo2.models.AntecedentesHeredofamiliares;
import com.example.demo2.repository.AntecedentesHeredofamiliaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AntecedentesHeredofamiliaresService {
    @Autowired
    AntecedentesHeredofamiliaresRepository antecedentesHeredofamiliaresRepository;
    public AntecedentesHeredofamiliares saveAntecendente(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        return antecedentesHeredofamiliaresRepository.save(antecedentesHeredofamiliares);
    }

    public List<AntecedentesHeredofamiliares> getAll() {
        return antecedentesHeredofamiliaresRepository.findAll();
    }
}

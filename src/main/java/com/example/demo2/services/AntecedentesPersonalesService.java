package com.example.demo2.services;

import com.example.demo2.models.AntecedentesHeredofamiliares;
import com.example.demo2.repository.AntecedentesHeredofamiliaresRepository;
import com.example.demo2.repository.AntecedentesPersonalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AntecedentesPersonalesService {
    @Autowired
    AntecedentesPersonalesRepository antecedentesPersonalesRepository;


}

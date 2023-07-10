package com.example.demo2.controllers;

import com.example.demo2.models.AntecedentesHeredofamiliares;
import com.example.demo2.services.AntecedentesHeredofamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/antecedentes_heredofamiliares")
public class AntecedentesHeredofamiliaresController {
    @Autowired
    AntecedentesHeredofamiliaresService antecedentesHeredofamiliaresService;
    @PostMapping("/postAntecendente")
    public ResponseEntity<AntecedentesHeredofamiliares> postAntecedente(@RequestBody AntecedentesHeredofamiliares antecedentesHeredofamiliares){
        return new ResponseEntity<>(antecedentesHeredofamiliaresService.saveAntecendente(antecedentesHeredofamiliares), HttpStatus.OK);
    }

}

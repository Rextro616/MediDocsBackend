package com.example.demo2.controllers;

import com.example.demo2.models.antecedentesPersonales.AntecedentePersonalDTO;
import com.example.demo2.services.AntecedentePersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/antecedentes_personales")
public class AntecedentePersonalController {
    @Autowired
    AntecedentePersonalService antecedentePersonalService;
    @PostMapping("/post")
    public ResponseEntity<Boolean> post(@Valid @RequestBody AntecedentePersonalDTO antecedentePersonalDTO){
        return new ResponseEntity<>(antecedentePersonalService.saveAntecendente(antecedentePersonalDTO), HttpStatus.OK);
    }
}

package com.example.demo2.controllers;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import com.example.demo2.services.AntecedenteHeredofamiliarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/antecedentes_heredofamiliares")
public class AntecedenteHeredofamiliarController {
    @Autowired
    AntecedenteHeredofamiliarService antecedentesHeredofamiliaresService;
    @PostMapping("/postAntecendente")
    public ResponseEntity<Boolean> postAntecedente(@RequestBody AntecedenteHeredofamiliarDTO antecedentesHeredofamiliares){
        return new ResponseEntity<>(antecedentesHeredofamiliaresService.saveAntecendente(antecedentesHeredofamiliares), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<AntecedenteHeredofamiliarDTO>> getAll(){
        return new ResponseEntity<>(antecedentesHeredofamiliaresService.getAll(),HttpStatus.OK);
    }
}

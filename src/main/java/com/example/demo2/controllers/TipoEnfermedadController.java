package com.example.demo2.controllers;

import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
import com.example.demo2.services.TipoEnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tipoEnfermedad")
public class TipoEnfermedadController {
    @Autowired
    TipoEnfermedadService tipoEnfermedadService;

    @GetMapping
    public ResponseEntity<List<TipoEnfermedad>> getAll(){
        return new ResponseEntity<>(tipoEnfermedadService.getAll(), HttpStatus.OK);
    }
}

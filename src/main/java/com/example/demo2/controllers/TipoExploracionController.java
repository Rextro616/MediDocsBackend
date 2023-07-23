package com.example.demo2.controllers;

import com.example.demo2.models.tipoExploracion.TipoExploracion;
import com.example.demo2.services.TipoExploracionService;
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
@RequestMapping("/tipoExploracion")
public class TipoExploracionController {
    @Autowired
    TipoExploracionService tipoExploracionService;

    @GetMapping
    public ResponseEntity<List<TipoExploracion>> get(){
        return new ResponseEntity<>(tipoExploracionService.get(), HttpStatus.OK);
    }
}

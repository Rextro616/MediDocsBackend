package com.example.demo2.controllers;

import com.example.demo2.models.Paciente;
import com.example.demo2.models.Usuario;
import com.example.demo2.services.PacienteService;
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
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    PacienteService pacienteService;
    @GetMapping("/getAll")
    public ResponseEntity<List<Paciente>> getAll() {
        return new ResponseEntity<>(pacienteService.getAll(), HttpStatus.OK);
    }

}

package com.example.demo2.controllers;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    PacienteService pacienteService;
    @GetMapping("/getAll")
    public ResponseEntity<List<PacienteDTO>> getAll() {
        return new ResponseEntity<>(pacienteService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<Boolean> postPaciente(@Valid @RequestBody PacienteDTO paciente){
        return new ResponseEntity<>(pacienteService.postPaciente(paciente),HttpStatus.OK);
    }
}

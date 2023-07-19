package com.example.demo2.controllers;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.models.medico.MedicoDTO;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.services.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/historiaClinica")
public class HistoriaClinicaController {
    @Autowired
    HistoriaClinicaService historiaClinicaService;

    @PostMapping("/post")
    public ResponseEntity<Boolean> post(@RequestBody HistoriaClinicaDTO historiaClinica){
        return new ResponseEntity<>(historiaClinicaService.postHistoriaClinica(historiaClinica), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<HistoriaClinica>> get(){
        return new ResponseEntity<>(historiaClinicaService.get(), HttpStatus.OK);
    }

    @GetMapping("/getById")
    public ResponseEntity<List<HistoriaClinicaDTO>> getById(@Valid @RequestParam Integer id, String opcion){

        return new ResponseEntity<>(historiaClinicaService.getById(id, opcion), HttpStatus.OK);
    }
}

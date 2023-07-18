package com.example.demo2.controllers;

import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.medico.MedicoDTO;
import com.example.demo2.models.usuario.UsuarioDTO;
import com.example.demo2.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/medico")
public class MedicoController {
    @Autowired
    MedicoService medicoService;

    @PostMapping("/postMedico")
    public ResponseEntity<Boolean> saveMedico(@Valid @RequestBody MedicoDTO medicoDTO){
        return new ResponseEntity<>(medicoService.saveMedico(medicoDTO), HttpStatus.OK);
    }
}

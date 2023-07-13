//package com.example.demo2.controllers;
//
//import com.example.demo2.models.Medico;
//import com.example.demo2.services.MedicoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/medico")
//public class MedicoController {
//    @Autowired
//    MedicoService medicoService;
//
//    @GetMapping("/getMedico")
//    public ResponseEntity<List<Medico>> getMedico(){
//        return new ResponseEntity<>(medicoService.getMedico(), HttpStatus.OK);
//    }
//}

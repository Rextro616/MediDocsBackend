//package com.example.demo2.controllers;
//
//import com.example.demo2.models.HistoriaClinica;
//import com.example.demo2.services.HistoriaClinicaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/historiaClinica")
//public class HistoriaClinicaController {
//    @Autowired
//    HistoriaClinicaService historiaClinicaService;
//
//    @PostMapping("/post")
//    public ResponseEntity<HistoriaClinica> post(@RequestBody HistoriaClinica historiaClinica){
//        return new ResponseEntity<>(historiaClinicaService.postHistoriaClinica(historiaClinica), HttpStatus.OK);
//    }
//}

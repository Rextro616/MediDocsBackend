//package com.example.demo2.controllers;
//
//import com.example.demo2.models.Rol;
//import com.example.demo2.services.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/rol")
//public class RolController {
//    @Autowired
//    RolService rolService;
//
//    @PostMapping("/createRol")
//    public ResponseEntity<Rol> postRol(@RequestBody Rol rol){
//        return new ResponseEntity<>(rolService.createRol(rol), HttpStatus.OK);
//    }
//
//    @GetMapping("/getAllRol")
//    public ResponseEntity<List<Rol>> getAllRol(){
//        return new ResponseEntity<>(rolService.getAllRol(), HttpStatus.OK);
//    }
//
//    @GetMapping("/getRolById")
//    public ResponseEntity<Object> getRolById(@RequestParam int id){
//        Optional<Rol> rol = rolService.getRolById(id);
//
//        return rol.<ResponseEntity<Object>>map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>("Rol no encontrado", HttpStatus.NOT_FOUND));
//    }
//
//    @DeleteMapping("/deleteRol/{id}")
//    public ResponseEntity<String> deleteRol(@PathVariable int id){
//        if (rolService.deleteRol(id)){
//            return new ResponseEntity<>("Rol borrao", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Rol no encontrao", HttpStatus.NOT_FOUND);
//        }
//    }
//
//}

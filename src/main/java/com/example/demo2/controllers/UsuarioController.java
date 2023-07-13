//package com.example.demo2.controllers;
//
//import com.example.demo2.models.Rol;
//import com.example.demo2.models.Usuario;
//import com.example.demo2.services.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/usuario")
//
//public class UsuarioController {
//    @Autowired
//    UsuarioService usuarioService;
//
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Usuario>> get() {
//        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
//    }
//    @GetMapping("/getUsuarioById")
//    public ResponseEntity<Object> getRolById(@RequestParam int id){
//        Optional<Usuario> rol = usuarioService.getRolById(id);
//
//        return rol.<ResponseEntity<Object>>map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>("Usuario no encontrado", HttpStatus.NOT_FOUND));
//    }
//    @PostMapping("/postUsuario")
//    public Usuario saveUsuario(@RequestBody Usuario usuario){
//        return usuarioService.saveUsuario(usuario);
//    }
//
//    @DeleteMapping("/deleteUsuario")
//    public String deleteUsuario(@RequestBody Usuario usuario){
//        return usuarioService.deleteUsuario(usuario);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<Usuario> login(@RequestParam String usuario, @RequestParam String contrasenia){
//        return new ResponseEntity<>(usuarioService.login(usuario,contrasenia),HttpStatus.OK);
//    }
//
//}

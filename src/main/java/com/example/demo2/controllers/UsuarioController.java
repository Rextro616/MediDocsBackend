package com.example.demo2.controllers;

import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.models.usuario.UsuarioDTO;
import com.example.demo2.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestParam String usuario, @RequestParam String contrasenia){
        return new ResponseEntity<>(usuarioService.login(usuario,contrasenia),HttpStatus.OK);
    }

}

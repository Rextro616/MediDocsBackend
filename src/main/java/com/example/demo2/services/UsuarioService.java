package com.example.demo2.services;

import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.models.usuario.UsuarioDTO;
import com.example.demo2.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{
    @Autowired
    UsuarioRepository userRepository;
    @Autowired
    ModelMapper modelMapper;

    public Usuario login(String usuario, String contrasenia){
        return userRepository.login(usuario, contrasenia);
    }
}

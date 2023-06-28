package com.example.demo2.services;

import com.example.demo2.models.Usuario;
import com.example.demo2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{
    @Autowired
    UsuarioRepository userRepository;
    public List<Usuario> getAll(){
        return userRepository.findAll();
    }
    public Optional<Usuario> getRolById(int id){
        return userRepository.findById(id);
    }
    public Usuario saveUsuario(Usuario usuario){
        return userRepository.save(usuario);
    }

    public String deleteUsuario(Usuario usuario){
        userRepository.delete(usuario);
        return "borrao";
    }

    public Usuario login(String usuario, String contrasenia){
        return userRepository.login(usuario, contrasenia);
    }
}

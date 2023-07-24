package com.example.demo2.services;

import com.example.demo2.enums.SexoEnum;
import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.models.usuario.UsuarioDTO;
import com.example.demo2.repository.UsuarioRepository;
import com.example.demo2.utils.CustomPasswordEncoder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {
    @Autowired
    UsuarioRepository userRepository;
//
//    public Usuario login(String usuario, String contrasenia){
//        return userRepository.login(usuario, contrasenia);
//    }
//
//    @Autowired
//    private CustomPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuario = userRepository.login(username);
        return usuario.orElseThrow(() -> new UsernameNotFoundException("Credenciales inválidas"));
    }
}

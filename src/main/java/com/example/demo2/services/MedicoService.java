package com.example.demo2.services;

import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.medico.MedicoDTO;
import com.example.demo2.models.usuario.Usuario;
import com.example.demo2.repository.MedicoRepository;
import com.example.demo2.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    UsuarioRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    public Boolean saveMedico(MedicoDTO medicoDTO) {
        if (userRepository.login(medicoDTO.getUsuario().getCorreoElectronico(), medicoDTO.getUsuario().getUsuarioContrasenia()) == null){
            Medico medico = modelMapper.map(medicoDTO, Medico.class);
            String pass = medico.getUsuario().getUsuarioContrasenia();
            medico.getUsuario().setUsuarioContrasenia(new BCryptPasswordEncoder().encode(pass));
            medicoRepository.save(medico);
            return true;
        }
        return false;
    }

}

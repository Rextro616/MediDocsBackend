package com.example.demo2.services;

import com.example.demo2.models.Rol;
import com.example.demo2.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Rol createRol(Rol rol){
        return rolRepository.save(rol);
    }

    public List<Rol> getAllRol(){
        return rolRepository.findAll();
    }

    public Optional<Rol> getRolById(int id){
        return rolRepository.findById(id);
    }

    public boolean deleteRol(int id){
        Optional<Rol> rol = rolRepository.findById(id);

        return rol.map(value -> {rolRepository.deleteById(id); return true;}).orElseGet(() -> false);
    }
}

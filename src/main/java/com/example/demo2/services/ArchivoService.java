package com.example.demo2.services;

import com.example.demo2.models.Archivo;
import com.example.demo2.repository.ArchivoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@AllArgsConstructor
public class ArchivoService {

    private ArchivoRepository archivoRepository;

    public Archivo subirArchivo(MultipartFile file) throws IOException {
        Archivo archivo = new Archivo();
        archivo.setNombre(file.getOriginalFilename());
        archivo.setTipo(file.getContentType());
        archivo.setContenido(file.getBytes());

        return archivoRepository.save(archivo);
    }

    public Archivo obtenerArchivo(Long id) {
        return archivoRepository.findById(id).orElse(null);
    }
}
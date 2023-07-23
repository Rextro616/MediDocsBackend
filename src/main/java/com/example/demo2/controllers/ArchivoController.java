package com.example.demo2.controllers;

import com.example.demo2.models.Archivo;
import com.example.demo2.services.ArchivoService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/archivo")
@AllArgsConstructor
public class ArchivoController {

    private ArchivoService archivoService;

    @PostMapping("/subirArchivo")
    public Archivo subirArchivo(@RequestParam("file") MultipartFile file) throws IOException {
        return archivoService.subirArchivo(file);
    }

    @GetMapping("/obtenerArchivo/{id}")
    public ResponseEntity<byte[]> obtenerArchivo(@RequestParam Long id) {
        Archivo archivo = archivoService.obtenerArchivo(id);
        if (archivo != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header("Content-Disposition", "attachment; filename=\"" + archivo.getNombre() + "\"")
                    .body(archivo.getContenido());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/verArchivo/{id}")
    public ResponseEntity<byte[]> verArchivo(@RequestParam Long id) {
        Archivo archivo = archivoService.obtenerArchivo(id);
        if (archivo != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(archivo.getTipo()))
                    .body(archivo.getContenido());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

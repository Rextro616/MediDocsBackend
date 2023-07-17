package com.example.demo2.repository;

import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfermedadRepository extends JpaRepository<Enfermedad, Integer> {
}

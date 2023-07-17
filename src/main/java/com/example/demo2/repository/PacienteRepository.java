package com.example.demo2.repository;

import com.example.demo2.models.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    @Query(value = "SELECT * FROM paciente WHERE correo_electronico = ?1 or telefono = ?2", nativeQuery = true)
    Paciente validarPaciente(String correoElectronico, String telefono);

}

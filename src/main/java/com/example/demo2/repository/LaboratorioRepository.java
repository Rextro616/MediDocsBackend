package com.example.demo2.repository;

import com.example.demo2.models.laboratorio.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends JpaRepository<Laboratorio, Integer> {
}

package com.example.demo2.repository;

import com.example.demo2.models.examenFisico.ExamenFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenFisicoRepository extends JpaRepository<ExamenFisico, Integer> {
}

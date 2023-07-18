package com.example.demo2.repository;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica,Integer> {
}

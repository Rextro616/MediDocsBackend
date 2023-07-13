package com.example.demo2.repository;

import com.example.demo2.models.antecedentesPersonales.AntecedentePersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentePersonalRepository extends JpaRepository<AntecedentePersonal,Integer> {
}

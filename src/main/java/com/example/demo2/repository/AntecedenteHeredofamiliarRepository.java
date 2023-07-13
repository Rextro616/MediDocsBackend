package com.example.demo2.repository;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedenteHeredofamiliarRepository extends JpaRepository<AntecedenteHeredofamiliar,Integer> {
}

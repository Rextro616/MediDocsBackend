package com.example.demo2.repository;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedentesHeredofamiliares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentesHeredofamiliaresRepository extends JpaRepository<AntecedentesHeredofamiliares,Integer> {
}

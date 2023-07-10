package com.example.demo2.repository;

import com.example.demo2.models.AntecedentesHeredofamiliares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
@Repository
public interface AntecedentesHeredofamiliaresRepository extends JpaRepository<AntecedentesHeredofamiliares,Integer> {
}

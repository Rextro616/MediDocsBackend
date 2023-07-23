package com.example.demo2.repository;

import com.example.demo2.models.neurologico.Neurologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeurologicoRepository extends JpaRepository<Neurologico, Integer> {
}

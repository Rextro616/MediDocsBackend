package com.example.demo2.repository;

import com.example.demo2.models.sinromatico.Sindromatico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SindromaticoRepository extends JpaRepository<Sindromatico, Integer> {
}

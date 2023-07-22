package com.example.demo2.repository;

import com.example.demo2.models.oftalmologico.Oftalmologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OftalmologicoRepository extends JpaRepository<Oftalmologico, Integer> {
}

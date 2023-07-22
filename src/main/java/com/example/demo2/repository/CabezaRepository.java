package com.example.demo2.repository;

import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.services.CabezaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabezaRepository extends JpaRepository<Cabeza, Integer> {

}

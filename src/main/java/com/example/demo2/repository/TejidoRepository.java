package com.example.demo2.repository;

import com.example.demo2.models.tejido.Tejido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TejidoRepository extends JpaRepository<Tejido, Integer> {
}

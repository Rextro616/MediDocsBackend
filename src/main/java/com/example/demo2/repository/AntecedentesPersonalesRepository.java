package com.example.demo2.repository;

import com.example.demo2.models.AntecedentesPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentesPersonalesRepository extends JpaRepository<AntecedentesPersonales,Integer> {
}

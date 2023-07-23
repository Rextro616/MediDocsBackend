package com.example.demo2.repository;

import com.example.demo2.models.electrocardiograma.Electrocardiograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectrocardiogramaRepository extends JpaRepository<Electrocardiograma, Integer> {
}

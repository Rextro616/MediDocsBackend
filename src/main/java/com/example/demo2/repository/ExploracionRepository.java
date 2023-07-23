package com.example.demo2.repository;

import com.example.demo2.models.exploracion.Exploracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExploracionRepository extends JpaRepository<Exploracion, Integer> {
}

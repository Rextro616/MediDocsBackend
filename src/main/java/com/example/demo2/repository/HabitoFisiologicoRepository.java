package com.example.demo2.repository;

import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitoFisiologicoRepository extends JpaRepository<HabitoFisiologico, Integer> {
}

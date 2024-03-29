package com.example.demo2.repository;

import com.example.demo2.models.habitosToxicos.HabitoToxico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitoToxicoRepository extends JpaRepository<HabitoToxico, Integer> {
}

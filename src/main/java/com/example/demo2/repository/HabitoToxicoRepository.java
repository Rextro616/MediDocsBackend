package com.example.demo2.repository;

import com.example.demo2.models.habitosToxicos.HabitoToxico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoToxicoRepository extends JpaRepository<HabitoToxico, Integer> {
}

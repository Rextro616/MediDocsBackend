package com.example.demo2.repository;

import com.example.demo2.models.torax.Torax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToraxRepository extends JpaRepository<Torax, Integer> {
}

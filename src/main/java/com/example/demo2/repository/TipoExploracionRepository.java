package com.example.demo2.repository;

import com.example.demo2.models.tipoExploracion.TipoExploracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoExploracionRepository extends JpaRepository<TipoExploracion,Integer> {
}

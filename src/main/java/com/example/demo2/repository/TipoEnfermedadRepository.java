package com.example.demo2.repository;

import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnfermedadRepository extends JpaRepository<TipoEnfermedad, Integer> {

}

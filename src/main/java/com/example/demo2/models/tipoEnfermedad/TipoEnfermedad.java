package com.example.demo2.models.tipoEnfermedad;

import com.example.demo2.models.enfermedad.Enfermedad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class TipoEnfermedad {
    @Id
    @Column(name = "id_tipo_enfermedad", unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @JsonIgnore
    @OneToOne(mappedBy = "tipoEnfermedad", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Enfermedad enfermedad;
}

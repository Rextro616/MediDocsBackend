package com.example.demo2.models.tipoExploracion;

import com.example.demo2.models.exploracion.Exploracion;
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
public class TipoExploracion {
    @Id
    @Column(name = "id_tipo_exploracion", unique = true, nullable = false)
    private int id;

    @Column(nullable = false, length = 100)
    private String tipo;

    @JsonIgnore
    @OneToOne(mappedBy = "tipoExploracion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Exploracion exploracion;
}

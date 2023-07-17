package com.example.demo2.models.enfermedad;

import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.tipoEnfermedad.TipoEnfermedad;
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
public class Enfermedad {
    @Id
    @Column(name = "id_enfermedad", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_enfermedad", nullable = false)
    TipoEnfermedad tipoEnfermedad;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @Column(name = "nombre_enfermedad", nullable = false, length = 100)
    private String nombreEnfermedad;

    @Column(length = 100)
    private String medicacion;
}

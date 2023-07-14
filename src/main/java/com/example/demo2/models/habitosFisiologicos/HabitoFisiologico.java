package com.example.demo2.models.habitosFisiologicos;

import com.example.demo2.models.paciente.Paciente;
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
public class HabitoFisiologico {
    @Id
    @Column(name = "id_habitos_fisiologicos", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 100)
    private String alimentacion;

    @Column(nullable = false, length = 100)
    private String diuresis;

    @Column(nullable = false, length = 100)
    private String catarsis;

    @Column(nullable = false, length = 100)
    private String suenio;

    @Column(nullable = false, length = 100)
    private String sexualidad;

    @Column(nullable = false, length = 100)
    private String alergias;

    @Column(length = 100)
    private String otros;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

}

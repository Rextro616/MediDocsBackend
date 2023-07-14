package com.example.demo2.models.habitosToxicos;


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
public class HabitoToxico {
    @Id
    @Column(name = "id_habitos_toxicos", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false,  length = 100)
    private String alcohol;

    @Column(nullable = false,  length = 100)
    private String tabaco;

    @Column(nullable = false,  length = 100)
    private String drogas;

    @Column(nullable = false,  length = 100)
    private String infusiones;

    @Column(nullable = false,  length = 100)
    private String actividad_fisica;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
}

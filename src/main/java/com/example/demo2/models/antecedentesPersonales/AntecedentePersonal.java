package com.example.demo2.models.antecedentesPersonales;

import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.paciente.Paciente;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedentePersonal {
    @Id
    @Column(name = "id_antecedentes_personales", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(mappedBy = "antecedentePersonal")
    private HabitoToxico habitoToxico;
    @OneToOne(mappedBy = "antecedentePersonal")
    private HabitoFisiologico habitoFisiologico;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
}

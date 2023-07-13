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
    @JoinColumn(name = "id_antecedentes_heredofamiliares")
    private HabitoToxico habitoToxico;
    @OneToOne(mappedBy = "antecedentePersonal")
    @JoinColumn(name = "id_antecedentes_heredofamiliares")
    private HabitoFisiologico habitoFisiologico;
    @OneToOne(mappedBy = "antecedentePersonal")
    @JoinColumn(name = "id_antecedentes_heredofamiliares")
    private Paciente paciente;
}

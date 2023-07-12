package com.example.demo2.models;

import com.example.demo2.models.habitosToxicos.HabitoToxico;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedentesPersonales {
    @Id
    @Column(name = "id_antecedentes_personales", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(mappedBy = "antecedentesPersonales")
    private HabitoToxico habitoToxico;
    private int id_habitos_fisiologicos;
    private int id_paciente;
}

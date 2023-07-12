package com.example.demo2.models.habitosToxicos;

import com.example.demo2.models.AntecedentesPersonales;
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
    @Id
    @Column(nullable = false,  length = 100)
    private String alcohol;
    @Id
    @Column(nullable = false,  length = 100)
    private String tabaco;
    @Id
    @Column(nullable = false,  length = 100)
    private String drogas;
    @Id
    @Column(nullable = false,  length = 100)
    private String infusiones;
    @Id
    @Column(nullable = false,  length = 100)
    private String actividad_fisica;
    @OneToOne
    @JoinColumn(name = "id_antecedentes_personales")
    private AntecedentesPersonales antecedentesPersonales;
}

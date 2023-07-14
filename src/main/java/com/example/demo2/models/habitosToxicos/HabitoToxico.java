package com.example.demo2.models.habitosToxicos;


import com.example.demo2.models.paciente.Paciente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @JsonIgnore
    @OneToOne(mappedBy = "habitoToxico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente paciente;
}

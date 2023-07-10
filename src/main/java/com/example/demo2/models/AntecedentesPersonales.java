package com.example.demo2.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class AntecedentesPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_antecedentes_personales;
    private int id_habitos_toxicos;
    private int id_habitos_fisiologicos;
    private int id_paciente;
}

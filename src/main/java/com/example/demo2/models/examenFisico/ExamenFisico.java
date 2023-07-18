package com.example.demo2.models.examenFisico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ExamenFisico {
    @Id
    @Column(name = "id_examen_fisico", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tension_arterial", length = 200)
    private String tensionArterial;

    @Column(name = "frecuencia_cardiaca", length = 200)
    private String frecuenciaCardiaca;

    @Column(name = "frecuencia_respiratoria", length = 200)
    private String frecuenciaRespirtoria;

    @Column(nullable = false, length = 10)
    private String temperatura;

    @Column(nullable = false, length = 10)
    private String peso;

    @Column(nullable = false, length = 10)
    private String altura;

    @Column(nullable = false, length = 10)
    private String imc;

    @Column(name = "impresion_general", length = 200)
    private String impresionGeneral;

    @Column(length = 200)
    private String constitucion;

    @Column(length = 200)
    private String facies;

    @Column(length = 200)
    private String actitud;

    @Column(length = 200)
    private String decubito;

    @Column(length = 200)
    private String marcha;




}

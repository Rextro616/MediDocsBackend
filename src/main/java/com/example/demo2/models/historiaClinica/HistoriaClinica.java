package com.example.demo2.models.historiaClinica;

import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.tejido.Tejido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HistoriaClinica {
    @Id
    @Column(name = "id_historiaclinica", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date fecha;

    @Column(name = "motivo_consulta", nullable = false, length = 200)
    private String motivoConsulta;

    @Column(name = "enfermedad_actual", nullable = false, length = 200)
    private String enfermedadActual;

    @Column(name = "antecenentes_enfermedad_actual", length = 200)
    private String antecenentesEnfermedadActual;

    @Column(name = "diagnosticos_diferenciales", length = 200)
    private String diagnosticosDiferenciales;

    @Column(name = "plan_diagnostico", length = 200)
    private String planDiagnostico;

    @Column(name = "plan_terapeutico", length = 200)
    private String planTerapeutico;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ExamenFisico examenFisico;

//    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Tejido tejido;
}

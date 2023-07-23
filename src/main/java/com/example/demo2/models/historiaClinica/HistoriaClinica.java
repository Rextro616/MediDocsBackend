package com.example.demo2.models.historiaClinica;

import com.example.demo2.models.Archivo;
import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.models.electrocardiograma.Electrocardiograma;
import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.exploracion.Exploracion;
import com.example.demo2.models.laboratorio.Laboratorio;
import com.example.demo2.models.medico.Medico;
import com.example.demo2.models.neurologico.Neurologico;
import com.example.demo2.models.oftalmologico.Oftalmologico;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.sinromatico.Sindromatico;
import com.example.demo2.models.tejido.Tejido;
import com.example.demo2.models.torax.Torax;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ExamenFisico examenFisico;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Tejido tejido;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cabeza cabeza;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Oftalmologico oftalmologico;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    private List<Exploracion> exploracion;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Neurologico neurologico;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Laboratorio laboratorio;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Electrocardiograma electrocardiograma;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Torax torax;

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Sindromatico sindromatico;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    private List<Archivo> archivo;

}

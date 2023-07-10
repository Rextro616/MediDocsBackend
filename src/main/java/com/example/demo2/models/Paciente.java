package com.example.demo2.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    private String id_usuario;
    private String ocupacion;
    private String estado_civil;
    private String nacionalidad;
    private String tipo_sangre;
    private String telefono;
    private String domicilio;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String sexo;
    private String fecha_nacimiento;
    private String correo_electronico;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    private AntecedentesPersonales antecedentesPersonales;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    private AntecedentesHeredofamiliares antecedentesHeredofamiliares;
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
}

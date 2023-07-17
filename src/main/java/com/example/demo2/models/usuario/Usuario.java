package com.example.demo2.models.usuario;

import com.example.demo2.enums.SexoEnum;
import com.example.demo2.models.medico.Medico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "id_usuario", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String usuario;

    @Column(name = "usuario_contrasenia", nullable = false, length = 100)
    private String usuarioContrasenia;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 20)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false, length = 20)
    private String apellidoMaterno;

    @Column( nullable = false, length = 10)
    private SexoEnum sexo;

    @Column(name = "fecha_nacimiento", nullable = false, length = 20)
    private Date fechaNacimiento;

    @Column(name = "correo_electronico", nullable = false, length = 20)
    private String correoElectronico;

    @JsonIgnore
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medico medico;

}

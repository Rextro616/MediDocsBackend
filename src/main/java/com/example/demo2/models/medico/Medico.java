package com.example.demo2.models.medico;

import com.example.demo2.models.usuario.Usuario;
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
public class Medico {
    @Id
    @Column(name = "id_medico", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, length = 100)
    private String cedula;

    @Column(length = 50)
    private String especialidad;
}

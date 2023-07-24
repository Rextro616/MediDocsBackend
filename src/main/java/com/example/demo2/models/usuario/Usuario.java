package com.example.demo2.models.usuario;

import com.example.demo2.domain.Authority;
import com.example.demo2.enums.SexoEnum;
import com.example.demo2.models.medico.Medico;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Usuario implements UserDetails {
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

//    private List<Authority> authorities = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new Authority("ROLE_MEDICO"));

        return roles;
    }

    @Override
    public String getPassword() {
        return usuarioContrasenia;
    }

    @Override
    public String getUsername() {
        return correoElectronico;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Usuario(int id, String usuario, String usuarioContrasenia, String nombre, String apellidoPaterno, String apellidoMaterno, SexoEnum sexo, Date fechaNacimiento, String correoElectronico) {
        this.id = id;
        this.usuario = usuario;
        this.usuarioContrasenia = usuarioContrasenia;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
    }


}

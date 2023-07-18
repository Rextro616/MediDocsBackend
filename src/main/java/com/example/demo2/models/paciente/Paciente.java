package com.example.demo2.models.paciente;

import com.example.demo2.enums.EstadoCivilEnum;
import com.example.demo2.enums.NacionalidadEnum;
import com.example.demo2.enums.SexoEnum;
import com.example.demo2.enums.TipoSangreEnum;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.models.enfermedad.Enfermedad;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.medico.Medico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Paciente {

    @Id
    @Column(name = "id_paciente", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 10)
    private String telefono;

    @Column(nullable = false, length = 30)
    private String ocupacion;

    @Column(name = "estado_civil", nullable = false, length = 10)
    private EstadoCivilEnum estadoCivil;

    @Column(nullable = false, length = 10)
    private NacionalidadEnum nacionalidad;

    @Column(name = "tipo_sangre", nullable = false, length = 10)
    private TipoSangreEnum tipoSangre;

    @Column(nullable = false, length = 200)
    private String domicilio;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 20)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false, length = 20)
    private String apellidoMaterno;

    @Column( nullable = false, length = 10)
    private SexoEnum sexo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "correo_electronico", nullable = false, length = 100)
    private String correoElectronico;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_antecedentes_heredofamiliares", nullable = false)
    private AntecedenteHeredofamiliar antecedenteHeredofamiliar;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_habitos_toxicos", nullable = false)
    private HabitoToxico habitoToxico;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_habitos_fisiologicos", nullable = false)
    private HabitoFisiologico habitoFisiologico;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Enfermedad> enfermedad = new ArrayList<>();

//    inmunizaciones

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;

}

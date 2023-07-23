package com.example.demo2.models.neurologico;

import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class NeurologicoDTO {
    private Integer glasgow;

    private String movilidadActiva;

    private String movilidadPasiva;

    private String movilidadRefleja;

    private String paresCraneales;

    private String sensibilidad;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

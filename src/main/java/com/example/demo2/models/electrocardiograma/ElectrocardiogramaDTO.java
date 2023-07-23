package com.example.demo2.models.electrocardiograma;

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
public class ElectrocardiogramaDTO {
    private Integer ritmo;

    private Integer frecuenciaCardiaca;

    private String eje;

    private Integer qrs;

    private String ondaP;

    private String ondaT;

    private Integer st;

    private Integer pr;

    private Integer qtc;

    private String conclusion;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

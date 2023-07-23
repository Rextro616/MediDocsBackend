package com.example.demo2.models.torax;

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
public class ToraxDTO {
    private String partesBlandas;

    private String partesOseas;

    private String camposPulmonares;

    private String siluetaCardiovascular;

    private String indiceCardiotoracico;

    private String conclusiones;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

package com.example.demo2.models.sinromatico;

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
public class SindromaticoDTO {
    private String nombre;

    private String diagnosticoEtiologico;
    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

package com.example.demo2.models.tejido;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class TejidoDTO {
    private String aspecto;

    private String distribucionPilosa;

    private String lesiones;

    private String faneras;

    private String tejidoCelularSubcutaneo;

    @JsonIgnore
    HistoriaClinicaDTO historiaClinica;
}

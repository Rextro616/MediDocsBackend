package com.example.demo2.models.oftalmologico;

import com.example.demo2.enums.RespuestaEnum;
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
public class OftalmologicoDTO {
    private String ojoDerecho;

    private String ojoIzquierdo;

    private RespuestaEnum lentesGraduados;

    private String graduacionLentes;

    private Integer distanciaParaVer;

    @JsonIgnore
    HistoriaClinicaDTO historiaClinica;
}

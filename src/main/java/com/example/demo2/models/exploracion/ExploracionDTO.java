package com.example.demo2.models.exploracion;

import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.models.tipoExploracion.TipoExploracion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ExploracionDTO {

    private String palpacion;

    private String inspeccion;

    private String percusion;

    private String auscultacion;

    @NotBlank(message = "Se requiere llenar el campo de tipo de exploracion >:(")
    private TipoExploracion tipoExploracion;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

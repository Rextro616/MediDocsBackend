package com.example.demo2.models.cabeza;

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
public class CabezaDTO {

    private String craneoCara;

    private String cueroCabelludo;

    private String regionFrontal;

    private String regionOrbitonasal;

    private String regionOrofaringea;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

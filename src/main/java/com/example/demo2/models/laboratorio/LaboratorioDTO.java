package com.example.demo2.models.laboratorio;

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
public class LaboratorioDTO {
    private Integer hto;
    private Integer leucocitos;
    private Integer linfocitos;
    private Integer monocitos;
    private Integer vmc;
    private Integer plaquetas;
    private Integer glucemia;
    private Integer urea;
    private Integer creatinina;
    private Integer sodio;
    private Integer potasio;
    private Integer cloro;
    private Integer got;
    private Integer gpt;
    private Integer fal;
    private Integer bilirrubinaTotal;
    private Integer coagulograma;
    private Integer ph;
    private Integer co2;
    private Integer hco3;
    private Integer po2;
    private Integer sat;
    private Integer gap;
    private String orina;
    private String hemocultivo;
    private String urocultivo;

    @JsonIgnore
    private HistoriaClinicaDTO historiaClinica;
}

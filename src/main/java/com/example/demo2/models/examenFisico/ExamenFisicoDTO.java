package com.example.demo2.models.examenFisico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ExamenFisicoDTO {
    private String tensionArterial;

    private String frecuenciaCardiaca;

    private String frecuenciaRespirtoria;

    @NotBlank (message = "Se requiere llenar el campo de fecha >:(")
    private String temperatura;

    @NotBlank (message = "Se requiere llenar el campo de fecha >:(")
    private String peso;

    @NotBlank (message = "Se requiere llenar el campo de fecha >:(")
    private String altura;

    @NotBlank (message = "Se requiere llenar el campo de fecha >:(")
    private String imc;

    private String impresionGeneral;

    private String constitucion;

    private String facies;

    private String actitud;

    private String decubito;

    private String marcha;

}

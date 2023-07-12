package com.example.demo2.models.habitosToxicos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HabitoToxicoDTO {
    private int id;
    private String alcohol;
    private String tabaco;
    private String drogas;
    private String infusiones;
    private String actividad_fisica;
}

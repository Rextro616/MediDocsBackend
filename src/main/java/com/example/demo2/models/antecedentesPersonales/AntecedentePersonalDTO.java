package com.example.demo2.models.antecedentesPersonales;

import com.example.demo2.models.habitosFisiologicos.HabitoFisiologicoDTO;
import com.example.demo2.models.habitosToxicos.HabitoToxicoDTO;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AntecedentePersonalDTO {
    @NotNull(message = "Se requiere un habito toxico >:(")
    private HabitoToxicoDTO habitoToxicoDTO;

    @NotNull(message = "Se requiere un habito fisiológico >:(")
    private HabitoFisiologicoDTO habitoFisiologicoDTO;

//    private PacienteDTO pacienteDTO;
}

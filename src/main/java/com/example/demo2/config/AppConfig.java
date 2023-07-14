package com.example.demo2.config;

import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliar;
import com.example.demo2.models.antecedentesHeredofamiliares.AntecedenteHeredofamiliarDTO;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologico;
import com.example.demo2.models.habitosFisiologicos.HabitoFisiologicoDTO;
import com.example.demo2.models.habitosToxicos.HabitoToxico;
import com.example.demo2.models.habitosToxicos.HabitoToxicoDTO;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

       // modelMapper.getConfiguration()
        //        .setMatchingStrategy(MatchingStrategies.STRICT)
        //        .setPropertyCondition(context -> !context.getMapping().getLastDestinationProperty().getName().equals("id"));


        return modelMapper;
    }
}

package com.example.demo2.utils.converters;

import com.example.demo2.enums.EstadoCivilEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class EstadoCivilEnumConverter implements AttributeConverter<EstadoCivilEnum,String> {
    @Override
    public String convertToDatabaseColumn(EstadoCivilEnum estadoCivilEnum) {
        if(Objects.isNull(estadoCivilEnum)) return null;
        return estadoCivilEnum.getNombre();
    }

    @Override
    public EstadoCivilEnum convertToEntityAttribute(String s) {
        return Stream.of(EstadoCivilEnum.values()).filter(estadoCivilEnum -> estadoCivilEnum.getNombre().equalsIgnoreCase(s)).findFirst().orElse(null);
    }
}

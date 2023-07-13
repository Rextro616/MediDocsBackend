package com.example.demo2.utils.converters;

import com.example.demo2.enums.SexoEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class SexoEnumConverter implements AttributeConverter<SexoEnum,String> {
    @Override
    public String convertToDatabaseColumn(SexoEnum sexoEnum) {
        if(Objects.isNull(sexoEnum)) return null;
        return sexoEnum.getDescripcion();
    }

    @Override
    public SexoEnum convertToEntityAttribute(String s) {
        return Stream.of(SexoEnum.values()).filter(sexoEnum -> sexoEnum.getDescripcion().equalsIgnoreCase(s)).findFirst().orElse(null);
    }
}

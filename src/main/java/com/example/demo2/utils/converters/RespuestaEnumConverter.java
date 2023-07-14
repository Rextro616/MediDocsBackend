package com.example.demo2.utils.converters;

import com.example.demo2.enums.RespuestaEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class RespuestaEnumConverter implements AttributeConverter<RespuestaEnum, Character> {

    @Override
    public Character convertToDatabaseColumn(RespuestaEnum respuestaEnum) {
        if(Objects.isNull(respuestaEnum)) return null;
        return respuestaEnum.getValue();
    }

    @Override
    public RespuestaEnum convertToEntityAttribute(Character character) {
        return Stream.of(RespuestaEnum.values()).filter(respuestaEnum -> respuestaEnum.getValue() == character).findFirst().orElse(null);
    }
}

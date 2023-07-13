package com.example.demo2.utils.converters;

import com.example.demo2.enums.NacionalidadEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class NacionalidadEnumConverter implements AttributeConverter<NacionalidadEnum, String> {
    @Override
    public String convertToDatabaseColumn(NacionalidadEnum nacionalidadEnum) {
        if(Objects.isNull(nacionalidadEnum)) return null;
        return nacionalidadEnum.getNombre();
    }

    @Override
    public NacionalidadEnum convertToEntityAttribute(String s) {
        return Stream.of(NacionalidadEnum.values()).filter(nacionalidadEnum -> nacionalidadEnum.getNombre().equalsIgnoreCase(s)).findFirst().orElse(null);
    }
}

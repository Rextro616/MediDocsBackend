package com.example.demo2.utils.converters;

import com.example.demo2.enums.TipoSangreEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class TipoDeSangreConverter implements AttributeConverter<TipoSangreEnum,String> {


    @Override
    public String convertToDatabaseColumn(TipoSangreEnum tipoSangreEnum) {
        if(Objects.isNull(tipoSangreEnum)) return null;
        return tipoSangreEnum.getValue();
    }

    @Override
    public TipoSangreEnum convertToEntityAttribute(String string) {
        if(Objects.isNull(string)) return null;
        return Stream.of(TipoSangreEnum.values()).filter(tipoSangreEnum -> tipoSangreEnum.getValue().equalsIgnoreCase(string)).findFirst().orElse(null);
    }
}

package com.example.demo2.enums;

public enum NacionalidadEnum {
    AFGANISTÁN("Afganistán"),
    ALEMANIA("Alemania"),
    ARGENTINA("Argentina"),
    AUSTRALIA("Australia"),
    BOLIVIA("Bolivia"),
    BRASIL("Brasil"),
    CANADÁ("Canadá"),
    CHILE("Chile"),
    CHINA("China"),
    COLOMBIA("Colombia"),
    COREA_DEL_SUR("Corea del Sur"),
    COSTA_RICA("Costa Rica"),
    CUBA("Cuba"),
    EGIPTO("Egipto"),
    ESPAÑA("España"),
    ESTADOS_UNIDOS("Estados Unidos"),
    FRANCIA("Francia"),
    INDIA("India"),
    ITALIA("Italia"),
    JAPÓN("Japón"),
    MÉXICO("México"),
    PERÚ("Perú"),
    REINO_UNIDO("Reino Unido"),
    RUSIA("Rusia"),
    SUIZA("Suiza"),
    VENEZUELA("Venezuela");

    private String nombre;

    NacionalidadEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

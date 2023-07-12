package com.example.demo2.enums;

public enum EstadoCivilEnum {
    SOLTERO("Soltero"),
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    VIUDO("Viudo"),
    SEPARADO("Separado");

    private String nombre;

    EstadoCivilEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

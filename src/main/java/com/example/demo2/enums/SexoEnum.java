package com.example.demo2.enums;

public enum SexoEnum {
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    INTERSEXUAL("Intersexual"),
    OTRO("Otro");

    private String descripcion;

    SexoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

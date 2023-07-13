package com.example.demo2.enums;

public enum TipoSangreEnum {
    A_POSITIVO("A+"),
    A_NEGATIVO("A-"),
    B_POSITIVO("B+"),
    B_NEGATIVO("B-"),
    AB_POSITIVO("AB+"),
    AB_NEGATIVO("AB-"),
    O_POSITIVO("O+"),
    O_NEGATIVO("O-");

    private String value;

    TipoSangreEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

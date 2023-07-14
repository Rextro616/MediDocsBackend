package com.example.demo2.enums;

public enum RespuestaEnum {

    SI('Y'), NO('N');

    private final char value;

    RespuestaEnum(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}

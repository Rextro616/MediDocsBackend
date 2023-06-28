package com.example.demo2.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;
@Entity
@Setter
@Getter
public class Anexos {
    @Id
    private int id_anexos;
    private String nombre;
    private Blob anexo;
}

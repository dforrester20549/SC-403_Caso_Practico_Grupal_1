package com.practica_grupal_1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")

/* Serializacion va almacenar datos de la base de Datos*/
public class Categoria implements Serializable{
    
    private static final long serailVersionUID = 1L; /*poder hacer el cilclo de la sumatoria de la categoria (auto-increment)*/
    
    @Id /*Id es la llavae de la tabla categoria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long Id;
    private String ruta_imagen;
    private String tipo_flor;
    private int dureza_madera;
    private String otros_datos;

    public Categoria() {
    }

    public Categoria(long Id, String ruta_imagen, String tipo_flor, int dureza_madera, String otros_datos) {
        this.Id = Id;
        this.ruta_imagen = ruta_imagen;
        this.tipo_flor = tipo_flor;
        this.dureza_madera = dureza_madera;
        this.otros_datos = otros_datos;
    }
    
    
}

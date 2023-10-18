package com.practica_grupal_1.service;

import com.practica_grupal_1.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se declara un metodo para obtener un ArrayListo de Objetos Categoria//
    //Los objetos vienen de la tabla categoria, todos los registros//
    
    public List<Categoria> getCategorias (boolean activos);
    
    //Abajo se colocara los metodos para realizar el CRUD de categorias//
}

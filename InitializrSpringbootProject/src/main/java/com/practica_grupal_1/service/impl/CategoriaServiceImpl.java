package com.practica_grupal_1.service.impl;

import com.practica_grupal_1.dao.CategoriaDao;
import com.practica_grupal_1.domain.Categoria;
import com.practica_grupal_1.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    //La anotacion autowired crea un unico objeto mientas se ejecuta la aplicacion//
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias (boolean activos){
        var Lista=categoriaDao.findAll();//encontrar todos los datos de la lista//
        if (activos){
            Lista.removeIf(e-> !e.isActivo());
        }
        
        return Lista;
    }
}

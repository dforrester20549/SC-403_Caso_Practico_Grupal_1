package com.practica_grupal_1.controller;

import com.practica_grupal_1.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/arbol")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
}

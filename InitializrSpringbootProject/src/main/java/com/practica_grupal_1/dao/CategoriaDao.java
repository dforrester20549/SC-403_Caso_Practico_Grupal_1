
package com.practica_grupal_1.dao;

import com.practica_grupal_1.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long> {
    
}

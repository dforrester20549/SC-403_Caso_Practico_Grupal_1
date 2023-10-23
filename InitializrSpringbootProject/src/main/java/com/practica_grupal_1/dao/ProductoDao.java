
package com.practica_grupal_1.dao;

import com.practica_grupal_1.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}

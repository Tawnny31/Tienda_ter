
package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tawnny Elizondo
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    //mas adelante se crea metodos ampliados
}

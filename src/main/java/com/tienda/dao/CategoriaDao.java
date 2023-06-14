
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tawnny Elizondo
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //mas adelante se crea metodos ampliados
}

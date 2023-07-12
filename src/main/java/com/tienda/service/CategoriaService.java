
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    public List<Categoria> getCategorias(boolean activos);
   
    //Se obtiene una categoria por ID
    public Categoria getCategoria(Categoria categoria);
    
    //insentar: cuando el idCategoria esta vacio (valor 0 o null)
    //modificar: modifica cuando el idCategoria NO esta vacio
    public void save(Categoria categoria);
    
    //eliminar: elimina un registro por idCategoria
    public void delete(Categoria categoria);
    
    
}

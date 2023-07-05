
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //metodo para consultar las productos. El parametro define si se muestran solo las activas o todas
    public List<Producto> getProductos(boolean activos);
   
    //Se obtiene una producto por ID
    public Producto getProducto(Producto producto);
    
    //insentar: cuando el idProducto esta vacio (valor 0 o null)
    //modificar: modifica cuando el idProducto NO esta vacio
    public void save(Producto producto);
    
    //eliminar: elimina un registro por idProducto
    public void delete(Producto producto);
    
}


package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly=true) //transaccion solo de lectura no bloquea la pagina
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias=categoriaDao.findAll();
        
        if(activos){
            categorias.removeIf(x->!x.isActivo());
                    }
        return categorias;
    }
    
}

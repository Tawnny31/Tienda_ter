package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    // Se obtiene un listado de clientes en un List
    public List<Cliente> getClientes();
    
    //Se obtiene un Cliente, a partir de id de un cliente
    public Cliente getCliente(Cliente cliente);
    
    //Se inserta un nuevo cliente si el id del cliente está vacío
    //Se actualiza un cliente si el id del cliente NO está vacío
    public void save(Cliente cliente);
    
    //Se elimina el cliente que tiene el id pasado por parametro
    public void delete(Cliente cliente);
}

package com.Tienda_IQ23.service;

import com.Tienda_IQ23.domain.Cliente;
import java.util.List;

/**
 *
 * @author Joseth
 */
public interface ClienteService {
    
    public List<Cliente> getClientes();
    public Cliente getClientes(Cliente cliente);
    public void save(Cliente cliente); //Tanto para insertar modificar un registro
    public void delete(Cliente cliente);
}

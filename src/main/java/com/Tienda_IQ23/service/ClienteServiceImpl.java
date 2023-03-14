package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dao.ClienteDao;
import com.Tienda_IQ23.domain.Cliente;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joseth
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    ClienteDao clienteDao;
    
    @Override
    @Transactional(redOnly = true)//Para mejorar transaciones de solo lectura
    public List<Cliente> getClientes(){
        return(List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(redOnly = true)//Para mejorar transaciones de solo lectura
    public Cliente getClientes(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
    
}

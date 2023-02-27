package com.Tienda_IQ23.dao;
import com.Tienda_IQ23.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Joseth
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}

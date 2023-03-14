package com.Tienda_IQ23.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Joseth
 */
@Data
@Entity
@Table(name="cliente")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria; 
    private String descripcion;
    private boolean activo;
    
    public Categoria(){
      
    }
    
    public Categoria(String descripcion, boolean activo){
        this.descripcion = descripcion;
        this.activo = activo;
    }
}

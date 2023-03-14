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
public class Articulo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo; 
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencia;
    private boolean activo;
    
    public Articulo(){
        
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, double precio, int existencia, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.activo = activo;
    }
    
    
}

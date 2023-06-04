

package Datos;

import java.util.Objects;

/**
 * Fecha: 19/09/2017
 * Autor: Antonio Aburto Cortez 
 */
public class Productos {
private String codigo;
private String descripción;
private Double precio;
private int stock;
private String categoria;

    public Productos() {
    }

    public Productos(String codigo, String descripción, Double precio, int stock, String categoria) {
        this.codigo = codigo;
        this.descripción = descripción;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", descripci\u00f3n=" + descripción + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

  



}

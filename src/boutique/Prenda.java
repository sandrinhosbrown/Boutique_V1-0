/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Sandro Gamarra
 */
public class Prenda {
    
    private String codigo;
    private double precio;
    private String descripcion;
    private String color;
    private String talla;

    public Prenda() {
    }

    public Prenda(String codigo, double precio, String descripcion, String color, String talla) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        this.talla = talla;
    }

    @Override
    public String toString() {
         String texto = "| Codigo: " + codigo + "| precio: " + precio + "| descripcion: " 
                 + descripcion + "| color: " + color + "| talla: " + talla + "|";
         return texto;
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
        final Prenda other = (Prenda) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}

package com.nerugdeveloper.comprasapp.modelo;

// Define la clase Articulo en el paquete com.nerugdeveloper.comprasapp.modelo
public class Articulo {
    // Variable privada para almacenar el nombre del artículo
    private String articulo;

    // Variable privada para almacenar el costo del artículo
    private double costoArticulo;

    // Constructor vacío de la clase Articulo
    public Articulo() {
    }

    // Método getter para obtener el nombre del artículo
    public String getArticulo() {
        return articulo;
    }

    // Método setter para establecer el nombre del artículo
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    // Método getter para obtener el costo del artículo
    public double getCostoArticulo() {
        return costoArticulo;
    }

    // Método setter para establecer el costo del artículo
    public void setCostoArticulo(double costoArticulo) {
        this.costoArticulo = costoArticulo;
    }
}

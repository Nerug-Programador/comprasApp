package com.nerugdeveloper.comprasapp.modelo;

// Define la clase TarjetaDeCredito en el paquete com.nerugdeveloper.comprasapp.modelo
public class TarjetaDeCredito {
    // Variable privada para almacenar el saldo de la tarjeta de crédito
    private double saldo;

    // Constructor vacío de la clase TarjetaDeCredito
    public TarjetaDeCredito() {
        // El constructor está vacío y no hace nada en particular
    }

    // Método setter para establecer el saldo de la tarjeta de crédito
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método getter para obtener el saldo de la tarjeta de crédito
    public double getSaldo() {
        return saldo;
    }
}

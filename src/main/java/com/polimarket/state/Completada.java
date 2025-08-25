package com.polimarket.state;

import org.springframework.stereotype.Component;

@Component
public class Completada implements EstadoVenta {

    @Override
    public void manejar(VentaContext context) {
        System.out.println("Venta completada. Nada que procesar.");
    }

    @Override
    public String nombre() { return "COMPLETADA"; }
}

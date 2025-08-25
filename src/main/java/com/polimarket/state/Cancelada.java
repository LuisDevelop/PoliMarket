package com.polimarket.state;

import org.springframework.stereotype.Component;

@Component
public class Cancelada implements EstadoVenta {

    @Override
    public void manejar(VentaContext context) {
        System.out.println("Venta cancelada. No se puede procesar.");
    }

    @Override
    public String nombre() { return "CANCELADA"; }
}

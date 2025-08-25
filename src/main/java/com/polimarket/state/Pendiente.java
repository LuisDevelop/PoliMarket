package com.polimarket.state;

import org.springframework.stereotype.Component;

@Component
public class Pendiente implements EstadoVenta {

    @Override
    public void manejar(VentaContext context) {
        System.out.println("Procesando venta pendiente...");
        // transición de ejemplo
        context.setEstado(context.getCompletada());
    }

    @Override
    public String nombre() { return "PENDIENTE"; }
}

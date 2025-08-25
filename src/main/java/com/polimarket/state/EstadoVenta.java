package com.polimarket.state;

public interface EstadoVenta {
    void manejar(VentaContext context);
    String nombre();
}

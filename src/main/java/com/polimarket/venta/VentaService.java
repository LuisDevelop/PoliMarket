package com.polimarket.venta;

import org.springframework.stereotype.Service;

@Service
public class VentaService {

    public void generarFactura(String producto, int cantidad) {
        // Lógica mínima simulada
        System.out.println("Factura generada para " + cantidad + " x " + producto);
    }
}

package com.polimarket.proveedor;

import org.springframework.stereotype.Service;

@Service
public class ProveedorService {

    public void solicitarProducto(String producto, int cantidad) {
        // Lógica mínima simulada para solicitar reabastecimiento
        System.out.println("Solicitando a proveedor " + cantidad + " unidades de " + producto);
    }
}

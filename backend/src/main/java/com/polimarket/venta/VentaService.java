package com.polimarket.venta;

import java.util.ArrayList;
import java.util.List;

public class VentaService {
    private List<Venta> ventas = new ArrayList<>();

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public List<Venta> listarVentas() {
        return ventas;
    }

    public List<Producto> obtenerProductosDisponibles(List<Producto> productos) {
        return productos.stream()
                .filter(p -> p.getCantidadDisponible() > 0)
                .toList();
    }
}
package com.polimarket.bodega;

import java.util.ArrayList;
import java.util.List;

public class BodegaService {
    private List<Inventario> inventario = new ArrayList<>();

    public void agregarProducto(Inventario item) {
        inventario.add(item);
    }

    public List<Inventario> listarInventario() {
        return inventario;
    }

    public void registrarSalidaProducto(String producto, int cantidad) {
        for (Inventario item : inventario) {
            if (item.getProducto().equalsIgnoreCase(producto)) {
                item.setCantidad(item.getCantidad() - cantidad);
                break;
            }
        }
    }
}
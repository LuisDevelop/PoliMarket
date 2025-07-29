package com.polimarket.proveedor;

import java.util.ArrayList;
import java.util.List;

public class ProveedorService {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void registrarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public List<Proveedor> listarProveedores() {
        return proveedores;
    }

    public Proveedor buscarProveedorPorNombre(String nombre) {
        return proveedores.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
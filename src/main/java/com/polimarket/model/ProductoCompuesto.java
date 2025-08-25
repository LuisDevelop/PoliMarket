package com.polimarket.model;

import java.util.ArrayList;
import java.util.List;

public class ProductoCompuesto implements Producto {
    private final String nombre;
    private final List<Producto> componentes = new ArrayList<>();

    public ProductoCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void addProducto(Producto p) {
        componentes.add(p);
    }

    public void removeProducto(Producto p) {
        componentes.remove(p);
    }

    @Override
    public double getPrecio() {
        return componentes.stream().mapToDouble(Producto::getPrecio).sum();
    }

    @Override
    public String getNombre() { return nombre; }

    public List<Producto> getComponentes() { return List.copyOf(componentes); }
}

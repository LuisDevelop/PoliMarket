package com.polimarket.model;

public class ProductoSimple implements Producto {
    private final String nombre;
    private final double precio;

    public ProductoSimple(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public String getNombre() { return nombre; }
}

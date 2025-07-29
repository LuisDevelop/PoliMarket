package com.polimarket.rrhh;

public class Vendedor {
    private Long id;
    private String nombre;
    private boolean autorizado;

    public Vendedor() {}

    public Vendedor(Long id, String nombre, boolean autorizado) {
        this.id = id;
        this.nombre = nombre;
        this.autorizado = autorizado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public boolean isAutorizado() { return autorizado; }
    public void setAutorizado(boolean autorizado) { this.autorizado = autorizado; }
}
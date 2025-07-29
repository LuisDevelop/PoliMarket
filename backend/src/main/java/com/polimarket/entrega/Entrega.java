package com.polimarket.entrega;

public class Entrega {
    private Long id;
    private String producto;
    private String cliente;
    private String direccion;

    public Entrega() {}

    public Entrega(Long id, String producto, String cliente, String direccion) {
        this.id = id;
        this.producto = producto;
        this.cliente = cliente;
        this.direccion = direccion;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
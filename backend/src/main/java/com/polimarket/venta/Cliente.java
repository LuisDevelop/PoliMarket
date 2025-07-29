package com.polimarket.venta;

public class Cliente {
    private Long id;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente() {}

    public Cliente(Long id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre='" + nombre + ''' + ", correo='" + correo + ''' + ", telefono='" + telefono + ''' + '}';
    }
}
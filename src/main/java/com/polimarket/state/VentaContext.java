package com.polimarket.state;

import org.springframework.stereotype.Component;

@Component
public class VentaContext {

    private EstadoVenta estado;
    private final Pendiente pendiente;
    private final Completada completada;
    private final Cancelada cancelada;

    public VentaContext(Pendiente pendiente, Completada completada, Cancelada cancelada) {
        this.pendiente = pendiente;
        this.completada = completada;
        this.cancelada = cancelada;
        this.estado = pendiente;
    }

    public void procesar() {
        System.out.println("Estado actual: " + estado.nombre());
        estado.manejar(this);
        System.out.println("Nuevo estado: " + estado.nombre());
    }

    public void setEstado(EstadoVenta estado) { this.estado = estado; }
    public EstadoVenta getEstado() { return estado; }

    public Pendiente getPendiente() { return pendiente; }
    public Completada getCompletada() { return completada; }
    public Cancelada getCancelada() { return cancelada; }
}

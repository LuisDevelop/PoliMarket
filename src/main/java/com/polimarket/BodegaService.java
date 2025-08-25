package com.polimarket.bodega;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import com.polimarket.event.StockChangedEvent;

@Service
public class BodegaService {

    private final ApplicationEventPublisher publisher;

    public BodegaService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public boolean verificarStock(String producto, int cantidad) {
        // Simulación: hay stock si cantidad <= 10
        return cantidad <= 10;
    }

    public void reducirStock(String producto, int cantidad) {
        // Simulación de reducción y notificación
        int nuevoStock = Math.max(0, 100 - cantidad);
        publisher.publishEvent(new StockChangedEvent(this, producto, nuevoStock));
        System.out.println("Stock reducido para " + producto + ": " + nuevoStock);
    }

    public void actualizarStock(String producto, int nuevaCantidad) {
        // Simulación de actualización directa y notificación
        publisher.publishEvent(new StockChangedEvent(this, producto, nuevaCantidad));
        System.out.println("Stock actualizado para " + producto + ": " + nuevaCantidad);
    }
}

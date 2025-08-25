package com.polimarket.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class VentasListener {

    @EventListener
    public void onStockChanged(StockChangedEvent event) {
        System.out.println("[Ventas] Stock de " + event.getProducto() + " ahora es " + event.getStock());
    }
}

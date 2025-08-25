package com.polimarket.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EntregaListener {

    @EventListener
    public void onStockChanged(StockChangedEvent event) {
        System.out.println("[Entrega] Verificando ruta por cambio de stock de " + event.getProducto());
    }
}

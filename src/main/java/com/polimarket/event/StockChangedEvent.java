package com.polimarket.event;

import org.springframework.context.ApplicationEvent;

public class StockChangedEvent extends ApplicationEvent {
    private final String producto;
    private final int stock;

    public StockChangedEvent(Object source, String producto, int stock) {
        super(source);
        this.producto = producto;
        this.stock = stock;
    }

    public String getProducto() { return producto; }
    public int getStock() { return stock; }
}

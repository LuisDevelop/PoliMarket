package com.polimarket.pago;

import org.springframework.stereotype.Component;

@Component
public class PasarelaExterna {
    public void pay(double cantidad) {
        System.out.println("Pago procesado por pasarela externa: " + cantidad);
    }
}

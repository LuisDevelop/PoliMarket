package com.polimarket.pago;

import org.springframework.stereotype.Component;

@Component
public class PagoAdapter implements SistemaPago {

    private final PasarelaExterna pasarela;

    public PagoAdapter(PasarelaExterna pasarela) {
        this.pasarela = pasarela;
    }

    @Override
    public void procesarPago(double monto) {
        pasarela.pay(monto);
    }
}

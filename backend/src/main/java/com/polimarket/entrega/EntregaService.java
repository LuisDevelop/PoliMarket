package com.polimarket.entrega;

import java.util.ArrayList;
import java.util.List;

public class EntregaService {
    private List<Entrega> entregas = new ArrayList<>();

    public void registrarEntrega(Entrega entrega) {
        entregas.add(entrega);
    }

    public List<Entrega> listarEntregas() {
        return entregas;
    }
}
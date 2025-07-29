package com.polimarket.rrhh;

import java.util.ArrayList;
import java.util.List;

public class RHService {
    private List<Vendedor> vendedoresAutorizados = new ArrayList<>();

    public void autorizarVendedor(Vendedor vendedor) {
        vendedor.setAutorizado(true);
        vendedoresAutorizados.add(vendedor);
    }

    public boolean estaAutorizado(Vendedor vendedor) {
        return vendedor.isAutorizado();
    }
}
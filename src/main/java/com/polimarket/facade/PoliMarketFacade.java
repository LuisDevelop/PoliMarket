package com.polimarket.facade;

import org.springframework.stereotype.Service;
import com.polimarket.venta.VentaService;
import com.polimarket.bodega.BodegaService;
import com.polimarket.proveedor.ProveedorService;

@Service
public class PoliMarketFacade {

    private final VentaService ventaService;
    private final BodegaService bodegaService;
    private final ProveedorService proveedorService;

    public PoliMarketFacade(VentaService ventaService, BodegaService bodegaService, ProveedorService proveedorService) {
        this.ventaService = ventaService;
        this.bodegaService = bodegaService;
        this.proveedorService = proveedorService;
    }

    public void realizarVenta(String producto, int cantidad) {
        if (bodegaService.verificarStock(producto, cantidad)) {
            ventaService.generarFactura(producto, cantidad);
            bodegaService.reducirStock(producto, cantidad);
        } else {
            proveedorService.solicitarProducto(producto, cantidad);
        }
    }
}

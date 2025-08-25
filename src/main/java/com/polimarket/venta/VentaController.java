package com.polimarket.venta;

import org.springframework.web.bind.annotation.*;
import com.polimarket.facade.PoliMarketFacade;
import com.polimarket.state.VentaContext;

@RestController
@RequestMapping("/venta")
public class VentaController {

    private final PoliMarketFacade facade;
    private final VentaContext ventaContext;

    public VentaController(PoliMarketFacade facade, VentaContext ventaContext) {
        this.facade = facade;
        this.ventaContext = ventaContext;
    }

    @PostMapping("/realizar")
    public String realizar(@RequestParam String producto, @RequestParam int cantidad) {
        facade.realizarVenta(producto, cantidad);
        ventaContext.procesar(); // demo del patrón State
        return "Venta procesada para " + producto + " x " + cantidad;
    }
}

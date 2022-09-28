package com.example.VendedoresReservas.Controllers;


import com.example.VendedoresReservas.Entities.concesionario;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservasController {

    @PostMapping("/api/reservas/clientes/{codcli}/coches/{matricula}")
    public void reservarCoche(@PathVariable String codcli, @PathVariable String matricula) throws Exception {
        concesionario.reservarCoche(codcli, matricula);

    }

    @DeleteMapping("/api/reservas/clientes/{codcli}/coches/{matricula}")
    public void cancelarReserva(@PathVariable String codcli, @PathVariable String matricula) throws Exception {

        concesionario.cancelarReserva(codcli, matricula);

    }

    }


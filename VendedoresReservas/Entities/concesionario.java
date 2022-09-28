package com.example.VendedoresReservas.Entities;

import java.util.ArrayList;
import java.util.HashMap;

public class concesionario {

    private static HashMap<String, Cliente> listaClientes = new HashMap<>();
    private static HashMap<String, Coche> listaCoches= new HashMap<>();
    private static HashMap<String, vendedor> listaVendedores = new HashMap<>();




    public static void aniadirVendedor(vendedor vendedor){
        listaVendedores.put(vendedor.getCodven(), vendedor);
    }


    public static void modificarVendedor(String codven, String nombre, String domicilio, int telefono) {
        vendedor vendedor = listaVendedores.get(codven);
        vendedor.modificarVendedor(nombre, domicilio, telefono);
    }


    public static void borrarVendedor(String codven) {

        listaVendedores.remove(codven);
    }


    public static ArrayList<vendedor> visualizarVendedores() {
        ArrayList<vendedor> listaven = new ArrayList<>();
        listaven.addAll(listaVendedores.values());
        return listaven;
    }


    public static void reservarCoche(String codcli, String matricula) throws Exception {
        Cliente cliente = listaClientes.get(codcli);
        Coche coche = listaCoches.get(matricula);
        if (coche.getEstado() != Coche.Estado.enVenta) throw new Exception("No se puede reservar.No está en venta");
        coche.setEstado(Coche.Estado.Reservado);
        cliente.getListaReservas().put(coche.getMatricula(), coche);
    }

    public static void cancelarReserva(String codcli, String matricula) throws Exception {
        Cliente cliente = listaClientes.get(codcli);
        Coche coche = listaCoches.get(matricula);
        if (cliente.getListaReservas().isEmpty()) throw new Exception("El cliente no tiene reservas disponibles");
        if (!cliente.getListaReservas().containsKey(matricula)) throw new Exception("El cliente no tiene reservas con esa matricula");
        coche.setEstado(Coche.Estado.enVenta);
        cliente.getListaReservas().remove(matricula);
    }


}
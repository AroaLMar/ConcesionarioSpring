package com.example.VendedoresReservas.Entities;

import java.util.HashMap;

public class Cliente {


    private String codcli;
    private String nombre;
    private String domicilio;
    private int telefono;
    private HashMap<String, Coche> listaReservas = new HashMap<>();

    public Cliente() {
    }

    public Cliente(String codcli, String nombre, String domicilio, int telefono) {
        this.codcli = codcli;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;

    }

    public HashMap<String, Coche> getListaReservas() {

        return listaReservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codcli='" + codcli + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono=" + telefono +
                ", listaReservas=" + listaReservas +
                '}';
    }
}

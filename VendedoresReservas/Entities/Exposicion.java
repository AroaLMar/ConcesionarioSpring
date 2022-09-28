package com.example.VendedoresReservas.Entities;

import java.util.ArrayList;

public class Exposicion {

    private String numExpo;
    private String ciudad;
    private ArrayList<Coche> coches;

    public Exposicion() {
    }

    public Exposicion(String numExpo, String ciudad, ArrayList<Coche> coches) {
        this.numExpo = numExpo;
        this.ciudad = ciudad;
        this.coches = coches;
    }

    public String getNumExpo() {
        return numExpo;
    }

    public void setNumExpo(String numExpo) {
        this.numExpo = numExpo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "Exposicion{" +
                "numExpo='" + numExpo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", coches=" + coches +
                '}';
    }

}

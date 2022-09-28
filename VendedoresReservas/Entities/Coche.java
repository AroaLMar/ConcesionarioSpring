package com.example.VendedoresReservas.Entities;

public class Coche {


    private String matricula;
    private String marca;
    private String modelo;
    private static Estado estado;

    enum Estado {
        enReparacion, Reservado, enVenta, Vendido
    }

    public Coche() {
    }


    public Coche(String matricula, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }


    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }


    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static Estado getEstado() {

        return estado;
    }

    public static void setEstado(Estado estado) {
        Coche.estado = estado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                ", matricula='" + matricula +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}

package com.herencia;

import java.util.Date;

public class Celular {
    private String marca;
    private String modelo;
    private short miliamperios;
    private String color;
    private short peso;
    private String tamanio;
    private String capacidad;

    public void llamar(){
        System.out.println("llamar");
    }
    public void colgar(){
        System.out.println("colgar");
    }
    public void marca(){
        System.out.println("marca");
    }
    public void guardar(){
        System.out.println("guardar");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public short getMiliamperios() {
        return miliamperios;
    }

    public String getColor() {
        return color;
    }

    public short getPeso() {
        return peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}

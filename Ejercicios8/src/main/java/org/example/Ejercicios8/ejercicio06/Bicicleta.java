package org.example.Ejercicios8.ejercicio06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Bicicleta {
    private int referencia;
    private String marca;
    private String modelo;
    private int peso;
    private int tamanyoruedas;
    private boolean motor;
    private GregorianCalendar fechaFabricacion;
    private double precio;
    private int nReferencias;

    public Bicicleta(int referencia, String marca, String modelo, int peso, int tamanyoruedas, boolean motor, GregorianCalendar fechaFabricacion, double precio, int nReferencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanyoruedas = tamanyoruedas;
        this.motor = motor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.nReferencias = nReferencias;
    }
    public Bicicleta(){
        referencia = 0;
        marca = null;
        modelo = null;
        peso = 0;
        tamanyoruedas = 0;
        motor = false;
        fechaFabricacion = null;
        precio = 0;
        nReferencias = 0;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPeso() {
        return peso;
    }

    public int getTamanyoruedas() {
        return tamanyoruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getnReferencias() {
        return nReferencias;
    }

    public void setnReferencias(int nReferencias) {
        this.nReferencias = nReferencias;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Bicicleta{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso + "kg" +
                ", tamanyoruedas=" + tamanyoruedas +
                ", motor=" + motor +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                ", numerodeexistenciaReferencia=" + nReferencias +
                '}';
    }
}

package org.example.Ejercicios8.ejercicio05;

import org.example.Ejercicios8.ejercicio04.Punto;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = new Punto(centro.getX(),centro.getY());
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.centro = new Punto(x,y);
        this.radio = radio;
    }

    /*public Ciruclo() {
        centro = new Punto(2,3);
        radio = 2.1;
    }*/

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularDistancia(Circulo c) {
        return centro.calcularDistancia(c.getCentro());
    }

    public double calarArea() {
        return 2.1;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}

package org.example.Ejercicios8.ejercicio04;

public class Punto {
    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto(){
        x = 2.10;
        y = 3.20;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto p){
        return Math.sqrt((Math.pow((getX()-x),2)+Math.pow((getY()-y),2)));
    }

    public static double calcularDistancia2(Punto p1, Punto p2){
        return Math.sqrt((Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2)));
    }
    public String visualitzarPunt(){
        return getX()+","+getY();
    }
}

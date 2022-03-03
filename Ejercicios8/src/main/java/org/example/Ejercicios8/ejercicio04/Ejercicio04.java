package org.example.Ejercicios8.ejercicio04;


public class Ejercicio04 {
    public Ejercicio04(){
        Punto p1 = new Punto();
        Punto p2 = new Punto(2,1);
        System.out.println(p1.calcularDistancia(p2));
        System.out.println(p1.visualitzarPunt());
        System.out.println(p2.visualitzarPunt());
        System.out.println("Distancia entre los dos puntos: "+p1.calcularDistancia(p2));
    }
}

package org.example.Ejercicios8.ejercicio02;

public class Asignaturas {
    private String nombre;
    private int codigoN;
    private String curso;

    public Asignaturas(String nombre, int codigoN, String curso) {
        this.nombre = nombre;
        this.codigoN = codigoN;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoN() {
        return codigoN;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "nombre='" + nombre + '\'' +
                ", codigoN=" + codigoN +
                ", curso='" + curso + '\'' +
                '}';
    }
}

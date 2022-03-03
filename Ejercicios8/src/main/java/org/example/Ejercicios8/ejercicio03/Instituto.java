package org.example.Ejercicios8.ejercicio03;

import com.github.javafaker.Faker;
import org.example.Ejercicios8.cajero.config.Config;
import org.example.Ejercicios8.cajero.util.Bombo;

import java.util.Date;
import java.util.GregorianCalendar;


public class Instituto {
    private Alumno[] alumnos;
    private int nAlumnos;
    private float factorCrecimiento;


    public Instituto(int minAlumnos) {
        alumnos = new Alumno[minAlumnos];
        nAlumnos = 0;
        if(Config.DEBUG){
            crearDatosPrueba(minAlumnos / 2);
        }
    }

    private void crearDatosPrueba(int cantidad) {
        Bombo bombo = new Bombo(cantidad,1);
        Faker faker = new Faker();
        for(int i = 0; i< cantidad;i++){
            int nia = bombo.extraerBola();
            String nombre = faker.name().name();
            String apellidos = faker.name().lastName();
            Date fecha = faker.date().birthday(18, 40);
            String grupo = faker.beer().name();
            String telefono = faker.phoneNumber().phoneNumber();

            GregorianCalendar fechaNacimiento = new GregorianCalendar();
            fechaNacimiento.setTime(fecha);
            alumnos[i] = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);

        }
    }

    public Alumno nuevoAlumno(long nia, String nombre, String apellidos, GregorianCalendar fechaNacimiento, String grupo, String telefono){
        if(buscarAlumnoPorNia(nia) != null){
            return null;
        }
        if(nAlumnos == alumnos.length){
            Alumno[] alumnosAmpliado = new Alumno[(int)(nAlumnos * Ejercicio03.CRECIMIENTO)];
            for(int i = 0; i < alumnosAmpliado.length; i++){
                alumnosAmpliado[i] = alumnos[i];
            }
            alumnos = alumnosAmpliado;
        }
        Alumno nuevoAlumno = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
        alumnos[nAlumnos++] = nuevoAlumno;
        return nuevoAlumno;
    }

    public int buscarAlumno(long nia){
        for(int i = 0; i < nAlumnos; i++){
            if(alumnos[i].getNia() == nia){
                return i;
            }
        }
        return -1;
    }

    public Alumno buscarAlumnoPorNia(long nia){
        int pos = buscarAlumno(nia);
        return pos < 0 ? null : alumnos[pos];
    }

    public Alumno[] buscarAlumnosGrupo(String grupo){
        Alumno[] alumnosGrupo;
        int contador = 0;
        int alumnosinsertados = 0;
        for(int i = 0; i < nAlumnos; i++) {
            if(alumnos[i].getGrupo().equalsIgnoreCase(grupo)) {
                contador++;
            }
        }
        if(contador > 0) {
            alumnosGrupo = new Alumno[contador];
            for (int i = 0; i < nAlumnos; i++) {
                if (alumnos[i].getGrupo().equalsIgnoreCase(grupo)) {
                    alumnosGrupo[alumnosinsertados++] = alumnos[i];
                }
            }
            return alumnosGrupo;
        }
        return null;
    }

    public Alumno[] buscarAlumnosEdad(int edad){
        Alumno[] alumnosEdad;
        int contador = 0;
        int alumnosinsertados = 0;
        for(int i = 0; i < nAlumnos; i++) {
            if(alumnos[i].getEdad() == edad) {
                contador++;
            }
        }
        if(contador > 0) {
            alumnosEdad = new Alumno[contador];
            for (int i = 0; i < nAlumnos; i++) {
                if (alumnos[i].getEdad() == edad) {
                    alumnosEdad[alumnosinsertados++] = alumnos[i];
                }
            }
            return alumnosEdad;
        }
        return null;
    }

    public Alumno[] buscarAlumnosApellidos(String apellidos){
        Alumno[] alumnosApellidos;
        int contador = 0;
        int alumnosinsertados = 0;
        for(int i = 0; i < nAlumnos; i++) {
            if(alumnos[i].getApellidos().equalsIgnoreCase(apellidos)) {
                contador++;
            }
        }
        if(contador > 0) {
            alumnosApellidos = new Alumno[contador];
            for (int i = 0; i < nAlumnos; i++) {
                if (alumnos[i].getApellidos().equalsIgnoreCase(apellidos)) {
                    alumnosApellidos[alumnosinsertados++] = alumnos[i];
                }
            }
            return alumnosApellidos;
        }
        return null;
    }

    public boolean elmininarAlumno(long nia){
        int pos = buscarAlumno(nia);
        if(pos < 0){
            return false;
        }
        alumnos[pos] = alumnos[nAlumnos - 1];
        alumnos[nAlumnos - 1] = null;
        nAlumnos--;
        return true;
    }
}

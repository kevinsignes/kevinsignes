package org.example.Ejercicios8.ejercicio03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alumno {
    private final long nia;
    private final String nombre;
    private final String apellidos;
    private final GregorianCalendar fechaNac;
    private final String grupo;
    private final String telefono;

    public Alumno(long nia, String nombre, String apellidos, GregorianCalendar fechaNac, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public long getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        int anyoNac = fechaNac.get(Calendar.YEAR);
        int mesNac = fechaNac.get(Calendar.MONTH) + 1;
        int diaNac = fechaNac.get(Calendar.DAY_OF_MONTH);

        GregorianCalendar fecha = new GregorianCalendar();
        int anyoActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH);
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);

        int edad = anyoActual - anyoNac;
        if(mesActual < mesNac){
            edad--;
        } else if (mesActual < diaNac) {
            if(diaActual < diaNac){
                edad--;
            }
        }
        return edad;
    }

    public int getEdad2() {
        int anyoNac = fechaNac.get(Calendar.YEAR);
        int mesNac = fechaNac.get(Calendar.MONTH) + 1;
        int diaNac = fechaNac.get(Calendar.DAY_OF_MONTH);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac = LocalDate.of(diaNac, mesNac, anyoNac);
        Period periodo = Period.between(fechaActual, fechaNac);
        return periodo.getYears();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return "Alumno{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac='" + sdf.format("dd/mm/yyyy") + '\'' +
                ", grupo='" + grupo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}

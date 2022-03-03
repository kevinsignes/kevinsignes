package org.example.Ejercicios8.ejercicio03;

import org.example.Ejercicios8.ejercicio03.Instituto;
import org.example.Ejercicios8.ejercicio03.Alumno;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio03 {
    private static Scanner scanner = new Scanner(System.in);
    private static final boolean DBUG= true;
    public static final int MIN_ALUMNO = 200;
    public static final float CRECIMIENTO = 2;
    public Ejercicio03(){
        Instituto intituto = new Instituto(20);
        Scanner scanner = new Scanner(System.in);
        int nalumno = 0;
        int opcion;
        int opcion2;
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                    /*datosAlumno(alumno);*/
                    break;
                case 2:
                    bajaAlumno();
                    break;
                case 3:
                    opcion2 = buscarAlumno();
                    switch (opcion2){
                        case 1:
                            porGrupo();
                            break;
                        case 2:
                            porEdad();
                            break;
                        case 3:
                            porNia();
                            break;
                        case 4:
                            porApellidos();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion != 0);
    }
    private int menu(){
        int opcion;
        boolean validado;
        do {
            System.out.println("*******************");
            System.out.println("**GESTIÓN ALUMNOS**");
            System.out.println("*******************");
            System.out.println("1.Nuevo alumno...");
            System.out.println("2.Baja de alumno...");
            System.out.println("3.Consultas");
            System.out.println("--------------------");
            System.out.println("0.Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            validado = opcion >= 0 && opcion <= 3;
        }while(!validado);
        return opcion;
    }

    private void datosAlumno(Alumno alumno){
        System.out.println("Introduze el nia: ");
        long nia = scanner.nextLong();scanner.nextLine();
        System.out.println("Introduze tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduze los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("Introduze su fecha de nacimiento: ");
        int nacimiento = scanner.nextInt();scanner.nextLine();
        System.out.println("Introduze el grupo al que quiere entrar: ");
        String grupo = scanner.nextLine();
        System.out.println("Introduze un teleono de contacto: ");
        String telefono = scanner.nextLine();
        if(alumno != null){
            System.out.println("El alumno " + alumno.getNombre() + " es válido");
        } else {
            System.out.println("alumno " + alumno.getNombre() + " es inválido");
        }
    }

    private void bajaAlumno(){
        System.out.println("Introduze el nia del alumno que quieres eliminar");
        String nia = scanner.nextLine();
        if(nia != null){
            System.out.println("Estas seguro que quieres borrar el alumno con este nia "+nia);
            String comprobar = scanner.nextLine();

        }
    }

    private int buscarAlumno(){
        int opcion;
        boolean validado = false;
        do {
            System.out.println("**************");
            System.out.println("** CONSULTAS **");
            System.out.println("***************");
            System.out.println("1.Por grupo...");
            System.out.println("2.Por edad...");
            System.out.println("3.Por nia...");
            System.out.println("4.Por apellidos");
            System.out.println("----------------");
            System.out.println("0.Volver al menú principal");
            opcion = Integer.parseInt(scanner.nextLine());
            validado = opcion >= 0 && opcion <= 3;
        }while (!validado);
        return opcion;
    }

    private void porGrupo(){
        int eleccion;
        System.out.println("Que grupo quieres ver");
        eleccion = Integer.parseInt(scanner.nextLine());
        if(eleccion == 1){
            System.out.println();
        }else if(eleccion == 2){
            System.out.println();
        }else if(eleccion == 3){
            System.out.println();
        }
    }
    private void porEdad(){

    }
    private void porNia(){

    }

    private void porApellidos(){

    }

}

package org.example.Ejercicios8.ejercicio06;

import com.github.javafaker.Faker;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import org.example.Ejercicios8.ejercicio06.Gestion;

public class Ejercicio06 {
    public static Scanner lector = new Scanner(System.in);
    public static final float CRECIMIENTO = 2;
    public static final int NUM_BICICLETAS = 20;
    public Ejercicio06() {
        Gestion gestion = new Gestion(NUM_BICICLETAS);
        int opcion;

        do{
            opcion = menuInicial();
            switch (opcion){
                case 1:
                    anyadirBicicleta();
                    break;
                case 2:
                    eliminarBicicleta();
                    break;
                case 3:
                    int opcion2 = consultarBicicleta();
                    switch (opcion2){
                        case 1:
                            /*consultaPorReferencia*/
                            break;
                        case 2:
                            /*cnsultarPorMarca*/
                            break;
                        case 3:
                            /*cnsultarPorModelo*/
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 4:
                    /*mostrarStock*/
                case 0:
                    System.out.println("Adios!!");
                    break;
                default:
                    break;
            }
        } while(opcion != 0);
    }
    private int menuInicial(){
        int opcion;
        boolean validado = false;
        do {
            System.out.println("***************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("***************************");
            System.out.println("1.-Añadir bicicleta...");
            System.out.println("2.-Vender bicicleta...");
            System.out.println("3.-Consultar bicicleta...");
            System.out.println("4.-Mostrar stock");
            System.out.println("---------------------------");
            System.out.println("0.-Salir");
            opcion = lector.nextInt();lector.nextLine();
            validado = opcion >= 0 && opcion <= 4;
        } while (!validado);
        return opcion;
    }

    public void anyadirBicicleta(){
        boolean motor = false;
        System.out.println("Introduze el numero de referencia");
        int referencia = lector.nextInt();lector.nextLine();
        Bicicleta bicicletas = new Bicicleta();
        Gestion gestion = new Gestion(NUM_BICICLETAS);
        Faker faker = new Faker();
        if(referencia == bicicletas.getReferencia()){
            System.out.println("Dime la marca");
            String marca = lector.nextLine();
            System.out.println("Dime el modelo");
            String modelo = lector.nextLine();
            System.out.println("Introdze el peso en kg");
            int peso =lector.nextInt();lector.nextLine();
            System.out.println("Introduze el tamaño de las ruedas en pulgadas");
            int tamanyoruedas = lector.nextInt();lector.nextLine();
            System.out.println("Tiene motor?(si/no)");
            String smotor = lector.nextLine();
            if(smotor.equalsIgnoreCase("si")){
                motor = true;
            }else if(smotor.equalsIgnoreCase("no")){
                motor = false;
            } else {
                System.out.println("Instruccion no valida");
            }
            System.out.println("Dime la fecha de fabricacion");
            GregorianCalendar fechaFabricacion = new GregorianCalendar();
            System.out.println("Introduce el precio");
            double precio = lector.nextDouble();lector.nextLine();
            int nReferencias = 1;
            bicicletas = gestion.nuevaBicicleta(referencia, marca, modelo, peso, tamanyoruedas, motor, fechaFabricacion, precio, nReferencias);
        }
    }

    public void eliminarBicicleta() {
        Bicicleta bicicletas = new Bicicleta();
        Gestion gestion = new Gestion(NUM_BICICLETAS);
        Faker faker = new Faker();
        System.out.println("Introduze el numero de referencia");
        int referencia = lector.nextInt();lector.nextLine();
        if(gestion.eliminarBicicleta(referencia) == true){
            System.out.println("bicicleta "+bicicletas.getReferencia()+" vendida correctamente");
        } else if(gestion.eliminarBicicleta(referencia) == false){
            System.out.println("El numero de referencia no coincide con ninguno existente");
        }
    }

    public int consultarBicicleta() {
        int opcion;
        boolean validado = false;
        do {
            System.out.println("***************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("***************************");
            System.out.println("1.-Consular por referencia...");
            System.out.println("2.-Consulta por marca...");
            System.out.println("3.-Consultar por modelo...");
            System.out.println("---------------------------");
            System.out.println("0.-Volver al menú principal");
            opcion = lector.nextInt();lector.nextLine();
            validado = opcion >= 0 && opcion <= 4;
        } while (!validado);
        return opcion;
    }

    public void consultaPorReferencia() {

    }

    public void consultaPorMarca() {

    }

    public void consultaPorModelo() {

    }
}

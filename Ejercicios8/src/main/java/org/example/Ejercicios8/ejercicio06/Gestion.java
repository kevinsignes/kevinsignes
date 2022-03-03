package org.example.Ejercicios8.ejercicio06;

import com.github.javafaker.Faker;
import org.example.Ejercicios8.cajero.config.Config;
import org.example.Ejercicios8.cajero.util.Bombo;
import org.example.Ejercicios8.ejercicio03.Alumno;
import org.example.Ejercicios8.libs.Util;
import org.example.Ejercicios8.ejercicio06.Bicicleta;

import java.util.Date;
import java.util.GregorianCalendar;

public class Gestion {
    private Bicicleta[] bicicletas;
    private int nBicicletas;
    private float factorCrecimiento;

    public Gestion(int minBicicletas) {
        bicicletas = new Bicicleta[minBicicletas];
        nBicicletas = 0;
        if(Config.DEBUG) {
            crearDatosPrueba(minBicicletas / 2);
        }
    }

    private void crearDatosPrueba(int cantidad) {
        Bombo bombo = new Bombo(cantidad, 1);
        Faker faker = new Faker();
        for (int i = 0; i < cantidad; i++) {
            int referencia = bombo.extraerBola();
            String marca = "MARCA";
            String modelo = "MODELO";
            int peso = Util.random(10, 75);
            int tamanyoruedas = Util.random(20, 30);
            boolean motor = true;
            Date fecha = faker.date().birthday();
            double precio = Util.randomd(300, 2000);
            int nReferencias = Util.random(1,10);

            GregorianCalendar fechaFabricacion = new GregorianCalendar();
            fechaFabricacion.setTime(fecha);
            bicicletas[i] = new Bicicleta(referencia, marca, modelo, peso, tamanyoruedas, motor, fechaFabricacion, precio, nReferencias);
        }
    }

    public Bicicleta nuevaBicicleta(int referencia, String marca, String modelo, int peso, int tamanyoruedas, boolean motor, GregorianCalendar fechaFabricacion, double precio, int nReferencias) {
        if(buscarBicicletaPorReferencia(referencia) != null) {
            return null;
        }
        if(nBicicletas == bicicletas.length) {
            Bicicleta[] bicicletasAmpliado = new Bicicleta[(int)(nBicicletas * Ejercicio06.CRECIMIENTO)];
            for(int i = 0; i < bicicletasAmpliado.length; i++) {
                bicicletasAmpliado[i] = bicicletas[i];
            }
            bicicletas = bicicletasAmpliado;
        }
        Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamanyoruedas, motor, fechaFabricacion, precio, nReferencias);
        bicicletas[nBicicletas++] = nuevaBicicleta;
        return nuevaBicicleta;
    }

    public int buscarBicicleta(int referencia){
        for(int i = 0; i < nBicicletas; i++){
            if(bicicletas[i].getReferencia() == referencia){
                return i;
            }
        }
        return -1;
    }

    public Bicicleta buscarBicicletaPorReferencia(int referencia){
        int pos = buscarBicicleta(referencia);
        return pos < 0 ? null : bicicletas[pos];
    }

    public boolean eliminarBicicleta(int referencia) {
        int pos = buscarBicicleta(referencia);
        if(pos < 0) {
            return false;
        }
        if(bicicletas[pos].getnReferencias() > 0) {
            bicicletas[pos] = bicicletas[nBicicletas - 1];
            bicicletas[nBicicletas - 1] = null;
            nBicicletas--;
            int newnumerosdeReferencia =bicicletas[pos].getnReferencias() -1;
        }
        return true;
    }

    public void consultarPorReferencia() {
        if(buscarBicicletaPorReferencia(123) != null) {
            System.out.println(bicicletas.toString());
        }
    }

    public Bicicleta[] consultarPorMarca(String marca){
        Bicicleta[] bicicletasMarca;
        int contador = 0;
        int bicicletasinsertadas = 0;
        for(int i = 0; i < nBicicletas; i++) {
            if(bicicletas[i].getMarca().equalsIgnoreCase(marca)) {
                contador++;
            }
        }
        if(contador > 0) {
            bicicletasMarca = new Bicicleta[contador];
            for (int i = 0; i < nBicicletas; i++) {
                if (bicicletas[i].getMarca().equalsIgnoreCase(marca)) {
                    bicicletasMarca[bicicletasinsertadas++] = bicicletas[i];
                }
            }
            return bicicletasMarca;
        }
        return null;
    }

    public Bicicleta[] consultarPorModelo(String modelo){
        Bicicleta[] bicicletasModelo;
        int contador = 0;
        int bicicletasinsertadas = 0;
        for(int i = 0; i < nBicicletas; i++) {
            if(bicicletas[i].getModelo().equalsIgnoreCase(modelo)) {
                contador++;
            }
        }
        if(contador > 0) {
            bicicletasModelo = new Bicicleta[contador];
            for (int i = 0; i < nBicicletas; i++) {
                if (bicicletas[i].getMarca().equalsIgnoreCase(modelo)) {
                    bicicletasModelo[bicicletasinsertadas++] = bicicletas[i];
                }
            }
            return bicicletasModelo;
        }
        return null;
    }

    public void mostrarStock (){
        for (int i = 0; i < nBicicletas; i++){
            System.out.println("Con este numero de referencia("+bicicletas[i].getReferencia()+") quedan "+bicicletas[i].getnReferencias());
        }
    }

}

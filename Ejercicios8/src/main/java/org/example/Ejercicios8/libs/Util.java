package org.example.Ejercicios8.libs;
import java.util.Random;

public class Util {
    /**
     * Generar un delay
     * @param milliseconds
     */
    public static void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ie){   
        }
    }
    /**
     * Random para numeros enteros
     * @param min
     * @param max
     * @return
     */
    public static int random(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
    /**
     * Random para numeros double
     * @param min
     * @param max
     * @return
     */
    public static double randomd(double min, double max) {
        Random r = new Random();
        return r.nextDouble()*(max - min ) + min ;
    }
    /**
     * Random que genera un character que este entre los numeros(ASCII)
     * @param min
     * @param max
     * @return
     */
    public static char randomchar(int min, int max){
        char randomizedCharacter = (char)random(min, max);
        return randomizedCharacter;
    }
}

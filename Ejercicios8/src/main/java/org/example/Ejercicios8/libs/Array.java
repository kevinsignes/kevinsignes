package org.example.Ejercicios8.libs;
import java.util.Scanner;

public class Array{
    private static Scanner lector = new Scanner(System.in);
    /**
     * Metodo para añadir valores de tipo entero a una array
     * @param array
     * @return
     */
    public static int[] array(int array[]){
        for(int i =0; i < array.length;i++){
            System.out.println("Introduze el valor "+ i);
            array[i] = lector.nextInt();
            lector.nextLine();
        }return array;
    }
    /**
     * Metodo para añadir valores de tipo char a una array
     * @param array
     * @return
     */
    public static char[] array(char array[]){
        for(int i =0; i < array.length;i++){
            System.out.println("Introduze el caracter "+ i);
            array[i] = lector.next().charAt(0);
        }return array;
    }
    /**
     * Metodo para añadir valores de tipo double a una array
     * @param array
     * @return
     */
    public static double[] array(double array[]){
        for(int i =0; i < array.length;i++){
            System.out.println("Introduze numero "+ i);
            array[i] = lector.nextDouble();
            lector.nextLine();
        }return array;
    }
    /**
     * Introduze en una array numeros random de tipo double
     * @param array
     * @return
     */
    public static double[] arrayRandom(double array[], double min, double max){
        for(int i =0; i < array.length;i++){
            array[i] = Util.randomd(min, max);
        }return array;
    }
    /**
     * Introduze en una array numeros random de tipo entero
     * @param array
     * @return
     */
    public static int[] arrayRandom(int array[], int min, int max){
        for(int i =0; i < array.length;i++){
            array[i] = Util.random(min, max);
        }return array;
    }
    /**
     * Crea la media de una array
     * @param array
     * @return
     */
    public static double mediaArray(double array[]){
        double media = 0;
        for(int i =0; i < array.length;i++){
            media += array[i];
        }
        media = media / array.length;
        return media;
    }
    /**
     * Crea la media de una array dentro de los que esten por encima de 5
     * @param array
     * @return
     */
    public static double mediaCondicional(double array[],int d){
        int contador = 0;
        double media = 0;
        for(int i =0; i < array.length;i++){
            if(array[i] >= d){
                contador++;
                media += array[i];
            }
        }
        media = media / contador;
        return media;
    }
    /**
     * Sumar dos arrays y crear otra con el resultado
     * @param array1
     * @param array2
     * @return
     */
    public static double[] sumaArray(int array1[],int array2[]){
        if(array1 != null && array2 != null && array1.length != array2.length){
            return null;
        }
        double []array = new double[array1.length];
        for(int i = 0; i < array1.length;i++){
            array[i] = array1[i] + array2[i];
        }
        return array;
    }
    /**
     * Dividir dos arrays y crear otra con el resultado
     * @param array1
     * @param array2
     * @return
     */
    public static double[] divisionArray(int array1[],int array2[]){
        if(array1 != null && array2 != null && array1.length != array2.length){
            return null;
        }
        double []array = new double[array1.length];
        for(int i = 0; i < array1.length;i++){
            array[i] = array1[i] / array2[i];
        }
        return array;
    }
    /**
     * Metodo para ver los multiples de 5 de la array
     * @param array
     * @param parametro
     */
    public static void multiplesArray5(int array[]){
        for(int i = 0; i < array.length;i++){
            if(array[i] % 5 == 0){
                System.out.println(array[i]);
            }
        }
    }
    /**
     * Metodo para ver los multiples de 10 de la array
     * @param array
     */
    public static void multiplesArray10(int array[]){
        for(int i = 0; i < array.length;i++){
            if(array[i] % 10 == 0){
                System.out.println(array[i]);
            }
        }
    }
    /**
     * Metodo para ver los numeros en la array iguales a 0
     * @param array
     */
    public static void array0(int array[]){
        for(int i = 0; i < array.length;i++){
            if(array[i] == 0){
                System.out.println(array[i]);
            }
        }
    }
    /**
     * Metodo para ver los multiples del numero que pasemos de la array
     * @param array
     * @param parametro
     */
    public static void multiplesArray(int array[],int parametro){
        for(int i = 0; i < array.length;i++){
            if(array[i] % parametro == 0){
                System.out.println(array[i]);
            }
        }
    }
    /**
     * Comprueba si un numero esta dentro de la array
     * @param array
     * @param numero
     * @return
     */
    public static boolean comprobarArray(int array[], int numero){
        for(int i = 0; i < array.length;i++){
            if(array[i] == numero){
                return true;
            }
        }
        return false;
    }
    /**
     * Comprobar si un numero esta dentro de la array version mejorada(version binaria)
     * @param array
     * @param numero
     * @return
     */
    public static int comprobarArray2(int array[], int numero){
        int centro;
        int inicio = 0;
        int fin = array.length -1;
        
        while(inicio <= fin){
            centro = (inicio + fin) / 2;
            if(array[centro] > numero){
                fin = centro -1;
            } else if(array[centro] < numero){
                inicio = centro +1;
            } else {
                return centro;
            }
        }
        return -1;
    }
    /**
     * Nos muestra los valores que tiene una array
     * @param array
     */
    public static void verArray(int array[]){
        for(int i = 0; i < array.length;i++){
            System.out.println("Valor "+i+" = "+array[i]);
        }
    }
    /**
     * Crea una array a partir de otra añadiendole una condicion
     * @param p
     * @param s
     * @param condicion
     * @return
     */
    public static int[] crearArraycondicional(int p[], int s[],int condicion){
        for(int i = 0; i < p.length;i++){
            if(p[i] >= condicion){
                s[i] = p[i];
            }else{
                s[i] = -1;
            }
        }return s;
    }
    /**
     * Crea una array igual a otra pero con los valores invertidos
     * @param v
     * @param p
     * @return
     */
    public static int[] arrayInversa(int v[], int p[]){
        for(int i = 0; i < v.length;i++){
            p[i]=v[v.length - 1 - i];
        }
        return p;
    }
    /**
     * Crea una array que va sumando el resultado de la suma de el anterior valor
     * @param p
     * @param v
     * @return
     */
    public static int[] arraySumatorio(int p[], int v[]){
        int contador = 0;
        for(int i = 0; i < p.length;i++){
            contador +=p[i];
            v[i]=contador;
        }
        return v;
    }
    /**
     * Crea una array a partid de otra en la que se almacenen los elementos pares
     * @param p
     * @param v
     * @return
     */
    public static int grandariaArray(int p[]){
        int contador = 0;
        for(int i = 0; i < p.length;i++){
            if(p[i] % 2 == 0){
                contador++;  
            }
        }
        if(contador == 0){
            System.out.println("Esta array no tiene ningun elemento par");
            return contador;
        }
        return contador;
    }
    /**
     * Metodo para rellenar una array unidimensional
     * @param v
     * @param p
     * @return
     */
    public static int[] rellenarArray(int v[], int p[]){
        int contador = 0;
        for(int i = 0; i < p.length;i++){
            if(p[i] % 2 == 0){
                v[contador]=p[i];
                contador++;
            }
        }
        return v;
    }
    /**
     * 
     * @param matriz
     * @param transpuesta
     */
    public static void matrizTranspuesta(int[][] matriz, int[][] transpuesta){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
    /**
     * Metodo para sacar el numero maximo de toda la matriz
     * @param m
     * @return
     */
    public static double maximo(double[][]m){
        double maximo = 0;
        for(int i = 0; i < m.length;i++){
            for(int j = 0;j <m[0].length;j++){
                if(maximo < m[i][j]){
                    maximo = m[i][j];
                }
            }
        }
        return maximo;
    }
    /**
     * Metodo para sacar el numero maximo de una columna en conctcreto
     * @param m
     * @param columna
     * @return
     */
    public static double maximocolumna(double[][]m,int columna){
        columna = columna -1;
        double x = 0;
        for(int i = 0; i< m.length; i++){
            if(m[i][columna] > x){
                x = m[i][columna];
            }
        }
        return x;
    }
    /**
     * Metodo para sacar la media de una columna en concreto
     * @param m
     * @param columna
     * @return
     */
    public static double mediacolumna(double[][]m,int columna){
        columna = columna -1;
        double x = 0;
        for(int i = 0; i< m.length; i++){
            x +=m[i][columna];
        }
        x= x/m.length;
        return x;
    }
    /**
     * Metodo para saber cuantos de esta columna superan el numero que se pase por media
     * @param m
     * @param columna
     * @param x
     * @return
     */
    public static int superan(double[][]m,int columna,double media){
        columna = columna -1;
        int s=0;
        for(int i = 0;i<m.length; i++){
            if(media < m[i][columna]){
                s++;
            }
        }
        return s;
    }
    /**
     * Metodo para visualizar una matriz
     * @param m
     */
    public static void visualizarMatriz(int[][]m){
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}

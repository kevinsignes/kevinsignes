package org.example.Ejercicios8.libs;

public class Calculos{

    public static double cirucloArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double circuloLong(double radio){
        return 2 * Math.PI * radio;
    }

    public static int maximo(int num1, int num2){
        if (num1 >= num2)
            return num1;
        else 
            return num2;
    }
    
    public static int factorial(int num){
        int cont = 1;
        for(int i = 2; i<=num;i++){
            cont *= i;
        }
        return cont;
    }

    public static long sumatorio(int n){
        long cont = 1;
        for(int i = n;i>=1;i--){
            cont += i;
        }
        return cont;
    }

    public static void tabla(int n){
        int res=0;
        for(int i = 0; i <= 10 ; i++){
            res = n*i;
            System.out.println(n+" x "+i+" = "+res);
        } 
    }

    public static int combinatorio(int n,int m){
        return factorial(n)/factorial(m)*factorial(n-m);
    }
}
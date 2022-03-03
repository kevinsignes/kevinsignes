package org.example.Ejercicios8.libs;
import java.util.Scanner;

public class Imprimir{
    private static Scanner lector = new Scanner(System.in);

    public static void imp(char c, int veces){
        for(int i = 1; i<= veces; i++){
            System.out.print(c+" ");
        }
        System.out.println(" ");
    }

    public static void imp2(char c, int veces, int linea){
        for(int i = 1; i <= linea; i++){
            for(int j = 1; j <= veces; j++){
                System.out.print(c+" ");
            }
            System.out.println(" ");
        }
    }

    public static void capicua(int a, int b, int c, int d){

        String cap = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
        String cap2 = String.valueOf(d) + String.valueOf(c) + String.valueOf(b) + String.valueOf(a);

        if(cap.equals(cap2)){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }

    }

    public static String nombreidioma(String nombre, char idioma){
        char a = 'a';
        char b = 'b';
        char c = 'c';
        String result = "";
        if(Character.compare(idioma, a) == 0){
            return result = "Bon dia, "+nombre;

        }else if(Character.compare(idioma, b) == 0){
            return result = "Buenos dias, "+nombre;

        }else if(Character.compare(idioma, c) == 0){
            return result = "Good morning, "+nombre;
        } return result;
    }

    public static void mostrarMenu(){

        System.out.println("MENÚ PRINCIPAL");
        System.out.println("===============");
        System.out.println("1. Palabra más larga");
        System.out.println("2. Palabra más corta");
        System.out.println("3. Número de vocales");
        System.out.println("---------------------------");
        System.out.println("0. Salir");

    }

    public static void opcion1(){
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        System.out.println("Introduze una palabra");
        palabra1 = lector.nextLine();
        System.out.println("Introduze la segunda palabra");
        palabra2 = lector.nextLine();
        System.out.println("Introduze la tercera palabra");
        palabra3 = lector.nextLine();

        if(palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()){
            System.out.println(palabra1+" es la palabra mas larga");
        }
        if(palabra2.length() > palabra1.length() && palabra2.length() > palabra3.length()){
            System.out.println(palabra2+" es la palabra mas larga");
            
        }
        if(palabra3.length() > palabra1.length() && palabra3.length() > palabra2.length()){
            System.out.println(palabra3+" es la palabra mas larga");
        }
    }

    public static void opcion2(){
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        System.out.println("Introduze una palabra");
        palabra1 = lector.nextLine();
        System.out.println("Introduze la segunda palabra");
        palabra2 = lector.nextLine();
        System.out.println("Introduze la tercera palabra");
        palabra3 = lector.nextLine();

        if(palabra1.length() < palabra2.length() && palabra1.length() < palabra3.length()){
            System.out.println(palabra1+" es la palabra mas corta");
        }
        if(palabra2.length() < palabra1.length() && palabra2.length() < palabra3.length()){
            System.out.println(palabra2+" es la palabra mas corta");
        }
        if(palabra3.length() < palabra1.length() && palabra3.length() < palabra2.length()){
            System.out.println(palabra3+" es la palabra mas corta");
        }
    }
    
    public static void opcion3(){
        String palabra1 = "";
        int contador = 0;
        int acentuadas = 0;
        int mayusculas = 0; 
        System.out.println("Introduze una palabra");
        palabra1 = lector.nextLine();
        for(int i = 0; i<palabra1.length();i++){
            if(palabra1.charAt(i)=='a'|| palabra1.charAt(i)=='e'|| palabra1.charAt(i)=='i' || palabra1.charAt(i)=='o'|| palabra1.charAt(i)=='u'){
                contador++;
                if(palabra1.charAt(i)=='á'|| palabra1.charAt(i)=='é'|| palabra1.charAt(i)=='í' || palabra1.charAt(i)=='ó'|| palabra1.charAt(i)=='ú'){
                    acentuadas++;
                }
                if(Character.isUpperCase(i)){
                    mayusculas++;
                }
                
            }
        }
        System.out.println("La palabra "+palabra1+" contiene "+contador+" vocales de las cuales "+acentuadas+" estan acentuadas y "+mayusculas+" son en mayusculas");
        
    }

    public static void contador(int n, char c){
        int milliseconds = 600;
        String numstr = String.valueOf(n);
        for(int d = 0; d <= 9;d++){
            for(int e = 0;e <= 9;e++){
                for(int b = 0;b <= 9;b++){
                    for(int a = 0;a <= 9;a++){
                        String s = d+"-"+e+"-"+b+"-"+a;
                        System.out.println(s.replace(numstr,String.valueOf(c)));
                        Util.wait(milliseconds); 
                    }
                }
            }  
        }      
    }

    public static void rectangulo(int ancho,int alto, char c){
        for(int i = 1; i <= alto; i++){
            for(int j = 1;j <= ancho;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    } 

    public static String obtindreDNI(int dni){
        String dni1 = ""+dni;
        return dni1; 
    }
    public static String calcularNIF(int dni){
        int cont = dni % 23;
        obtindreDNI(dni);
        char letra='a';

        switch(cont){
            case 0:
            letra = 'T';
            break; 
            case 1:
            letra = 'R';
            break;
            case 2:
            letra = 'W';
            break;
            case 3:
            letra = 'A'; 
            break;
            case 4:
            letra = 'G';
            break;
            case 5:
            letra = 'M';
            break;
            case 6:
            letra = 'Y';
            break;
            case 7:
            letra = 'F'; 
            break;
            case 8:
            letra = 'P';
            break;
            case 9:
            letra = 'D';
            break;
            case 10:
            letra = 'X';
            break;
            case 11:
            letra = 'B';
            break;
            case 12:
            letra = 'N';
            break;
            case 13:
            letra = 'J';
            break;
            case 14:
            letra = 'Z';
            break;
            case 15:
            letra = 'S';
            break;
            case 16:
            letra = 'Q';
            break;
            case 17:
            letra = 'V';
            break;
            case 18:
            letra = 'H';
            break;
            case 19:
            letra = 'T';
            break;
            case 20:
            letra = 'C';
            break;
            case 21:
            letra = 'K';
            break;
            case 22:
            letra = 'E';
            break;
        } return dni+""+String.valueOf(letra);
    }
    
    public static String primeraMay(String frase){
        if(frase !=null && frase.isEmpty()){
            return null;
        }
        char a = frase.charAt(0);
        return frase.replace(frase.charAt(0),Character.toUpperCase(a));
    }
    /**
     * 
     * @param frase
     * @return
     */
    public static String vocalesconso(String frase){
        int vocal = 0;
        int consonante = 0;
        int otro = 0;
        for(int i = 0; i<frase.length();i++){
            if(frase.charAt(i)<'a'||frase.charAt(i)>'z'){
                otro++;
            } else if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                vocal++;
            } else {
                consonante++;
            } 
        } 
        return "tiene "+vocal+" vocales "+consonante+" consonantes y "+otro+" caracteres diferetes";
    }
    /**
     * Nos indica el numero de palabras que tiene una frase
     * @param frase
     * @return
     */
    public static int numeroPalbras(String frase){
        int contador = 1; 
        int a = 1;
        frase = frase.trim();
        if(frase !=null && frase.isEmpty()){
            contador = 0;
        } else {
            a = frase.indexOf(" ");
            while(a != -1){
                contador++;
                a = frase.indexOf(" ", a + 1);
            }
        }
        return contador;
    }
    /**
     * Separa una frase creando una array
     * @param frase
     */
    public static void separarFrase(String frase){
        frase = frase.trim();
        String[] dividir = frase.split(" ");
        for (int i=0; i<dividir.length; i++){
            System.out.println(dividir[i]+" "+vocalesconso(dividir[i]));
        }
    }
    /**
     * Nos indica la palabra mas larga de una frase
     * @param frase
     */
    public static void palabraLarga(String frase){
        frase = frase.trim();
        String[] dividir = frase.split(" ");
        int cont = dividir[0].length();
        for (int i=0; i<dividir.length; i++){
            if(cont <= dividir[i].length()){
                cont = dividir[i].length();
                System.out.println(dividir[i]+" tiene "+cont+" letras");
            }
        }
    }
    /**
     * Imprime una frase las veces que se indique
     * @param frase
     * @param veces
     */
    public static void fraseveces(String frase,int veces){
        for(int i = 0; i <veces;i++){ 
            System.out.println(frase);
        }
    }
    /**
     * Divide la frase en palabras y las imprime una en cada renglon
     * @param frase
     */
    public static void dividirfrase(String frase){
        frase = frase.trim();
        String[] dividir = frase.split(" ");
        for (int i=0; i<dividir.length; i++){
            System.out.println(dividir[i]);
        }
    }
    /**
     * Divide la frase y cuenta el numero de caracteres de las palabras
     * @param frase
     * @return
     */
    public static void numeroletras(String frase){
        frase = frase.trim();
        String[] dividir = frase.split(" ");
        for (int i=0; i<dividir.length; i++){
            int cont = dividir[i].length();
            System.out.printf("%-10.10s %-10.10s%n",dividir[i],cont);
        }
    }
    /**
     * Devuelve una frase a partir de otra pero sin los caracteres que ocupan las posiciones impares
     * @param frase
     * @return
     */
    public static String fraseimpar(String frase){
        StringBuilder fraseimpar = new StringBuilder();/*usamos StringBuilder para mejorar el rendimineto del metodo y que no cree varios String*/
        for(int i = 1; i < frase.length(); i++){
            if(i%2 ==0){
                fraseimpar.append(frase.charAt(i));
            }
        }
        return fraseimpar.toString();
    }
    /**
     * Convierte la frase en inversa, se compara si son iguales y devuelve un booleano(true o false)
     * @param frase
     * @return
     */
    public static boolean palindroma(String frase){
        frase = frase.trim();
        String sb = new StringBuilder(frase).reverse().toString();
        return sb.equals(frase);
    }        
}
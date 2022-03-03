package org.example.Ejercicios8.libs;

public class Ansi {
    public enum Color {
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE, NONE
    }

    public enum ColorType {
        FOREGROUND, BACKGROUND
    }

    public static final String ESC = "\u001b[";
    public static final String RESET = ESC + "0m";

    public static Color random() {
        int min = 0;
    
        int max = Color.values().length - 1;
        int alea = Util.random(min, max);
        return Color.values()[alea];
    }

    public static void printTo(char c, int col, int row) {
        printTo(c, col, row, false, Color.NONE, Color.NONE);
    }


    public static void printTo(char c, int col, int row, boolean bold, Color fg, Color bg) {
        String fgColor = getColor(fg, ColorType.FOREGROUND);
        String bgColor = getColor(bg, ColorType.BACKGROUND);
        String negrita = bold ? "1" : "0";
        String color = "";
        if(!fgColor.isEmpty() || !bgColor.isEmpty()) {
            color = ESC + negrita;
            color += (!fgColor.isEmpty()) ? ";" + fgColor : "";
            color += (!bgColor.isEmpty()) ? ";" + bgColor : "";
            color += "m";
        }
        System.out.print(ESC + row + ";" + col + "f");
        System.out.print(color + c);
        if(!color.isEmpty())
            System.out.print(RESET);
        System.out.flush();

    }

    public static String getColor(Color c, ColorType ct) {
        String result = "";
        if(c != Color.NONE) {
            switch(ct) {
                case FOREGROUND:
                    result = "3" + c.ordinal();
                    break;
                case BACKGROUND:
                    result = "4" + c.ordinal();
                    break;
            }
        }
        return result;
    }
    public static void cleanScreen(){
        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
    }

    public static void hidecursor(){
        System.out.print (ESC + "?25l");
        System.out.flush();
    }
    public static void showcursor(){
        System.out.print(ESC + "?25h");
        System.out.flush();
    }
}

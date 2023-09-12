import java.util.Scanner;

public class stringmethods {
    public static void main(String[] args) {

        /* 

        String palabraLarga = "paralelepipedo";
        String palabracorta = "love";

        System.out.println("la primera palabra contiene: " + palabraLarga.length() + " la segunda palabras:  " + palabracorta.length() + " letras " );
        */
        
        Scanner entrada = new Scanner (System.in);

        String palabra;

        System.out.println("ingrese palabra: " );
        palabra = entrada.next();

        System.out.println(palabra.toUpperCase());
    }
    
}

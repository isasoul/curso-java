import java.util.Scanner;

public class ejercicio5 {

    //raiz cuadrada y cubica con metodo Math sqrt / cbrt

    public static void main(String[] args) throws Exception   {

        Scanner entrada = new Scanner (System.in);

        double numero;

        System.out.println("ingrese el numero: ");

        numero = entrada.nextDouble();

        double raiz = Math.sqrt(numero);

        double cubica = Math.cbrt(numero);

        System.out.println(" la raiz cuadrada de " + numero + " es: " + raiz + " y la raiz cúbica de el numero es: " + cubica);
        
        
    }  
}

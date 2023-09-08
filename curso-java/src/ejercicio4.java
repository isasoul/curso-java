import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner (System.in);

        int base;
        int exponente;

        System.out.println("ingrese la base : ");
        base =  entrada.nextInt();

         System.out.println("ingrese el exponente : ");
         exponente =  entrada.nextInt();

        int resultado = (int) Math.pow(base, exponente);

        System.out.println(" la base : " + base + " elevada al: " + exponente + " da: " + resultado);

    }
    
}

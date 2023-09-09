import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in) ;

        int numero1;
        int numero2;

        

        System.out.println(" primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println(" segundo numero: ");
        numero2 = entrada.nextInt();

        int mayor =  Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        System.out.println("el numero mayor es: " + mayor + " el numero menor es: " + menor);
    }
    
}

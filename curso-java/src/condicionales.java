import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        //condicionales

        Scanner entrada = new Scanner (System.in);

        int numero_random ;

        System.out.println("ingrese un numero: ");

        numero_random = entrada.nextInt();

        if(numero_random == 100) {

            System.out.println("numero es igual a 100 ");
        } else if( numero_random == 50) {

            System.out.println(" el numero es igual a 50 ");
            
        } else if( numero_random == 10){

            System.out.println(" el numero es igual a 10 ");
            
        }else{
            System.out.println("ingresar numero valido");
        }
    }
}

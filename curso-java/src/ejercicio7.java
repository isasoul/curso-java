import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

       Scanner entrada = new  Scanner (System.in);

       int opcion_ingresada;

       System.out.println("ingrese el la opcion que prefiera: ");
       opcion_ingresada = entrada.nextInt();

       switch(opcion_ingresada){

        case 1 :
            System.out.println("opcion 1");
        break;

        case 2 :
            System.out.println("opcion 2");
        break;
            
        case 3:
            System.out.println("opcion 3");
        break;

        default: System.out.println("no me jodas");
            
       }

        
    }
}

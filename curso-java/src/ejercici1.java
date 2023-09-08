import java.util.Scanner;

public class ejercici1 {
    public static void main(String[] args) throws Exception {

        //ejercicio 1 superficie del cuadrado

        Scanner entrada = new Scanner(System.in);

        float superficie;
        float lado;

        System.out.println("ingrese el tamaño del lado del cuadrado: ");
        lado = entrada.nextFloat();

        superficie = lado * lado;

        System.out.println("la superficie del cuadrado es: " + superficie);
    
    
    }



}
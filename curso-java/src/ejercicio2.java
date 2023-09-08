import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {

        //calculo del area de un triangulo
        
        Scanner entrada = new Scanner (System.in);

        Double base;
        Double altura;

        System.out.println("ingrese la base del triangulo: ");
        base = entrada.nextDouble();

        System.out.println(" ingrese la altura del triangulo: ");
        altura = entrada.nextDouble();

        Double area = base * altura / 2;

        System.out.println(" el area del triangulo es: " + area);
    
    }

}

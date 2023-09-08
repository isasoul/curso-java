import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) throws Exception {

        //promedio 5 notas

        Scanner entrada = new Scanner (System.in);

        int nota1, nota2 , nota3 , nota4 , nota5;
        int promedio;

        System.out.println("ingrese nota 1: ");
        nota1 = entrada.nextInt();

        System.out.println("ingrese nota 2: ");
        nota2 = entrada.nextInt();

        System.out.println("ingrese nota 3: ");
        nota3 = entrada.nextInt();

        System.out.println("ingrese nota 4: ");
        nota4 = entrada.nextInt();

        System.out.println("ingrese nota 5: ");
        nota5 = entrada.nextInt();

        int notas = nota1 + nota2 + nota3 + nota4 + nota5;
        promedio = notas / 5;

        System.out.println("el promedio es: " + promedio);



     }
}

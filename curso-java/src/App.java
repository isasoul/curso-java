import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 

        System.out.println("Hello, World!");
        System.out.println("soy Maria Isabel ");
        
        //variables
        int numero;
        numero = 10;
        System.out.println(numero);

        float numero_flotante = 2.5f;
        System.out.println(numero_flotante);

        double numero_double = 2.5565;
        System.out.println(numero_double);

        String texto = "prueba de texto";
        texto += " texto agregado";
        System.out.println(texto);

        char caracter = 'A';
        System.out.println(caracter);
        
        boolean var_boolean = true;
        System.out.println(var_boolean);


        //ingreso de datos

        Scanner teclado = new Scanner(System.in);

        int edad;
        String nombre;
        float altura;

        System.out.println("digite su edad: ");
        edad = teclado.nextInt();

        System.out.println("ingrese su nombre: ");
        nombre = teclado.next();

        System.out.println("ingrese su altura: ");
        altura = teclado.nextFloat();

        System.out.println("la edad es: " + edad);
        System.out.println("el nombre es: " + nombre);
        System.out.println("la altura es: " + altura);

        

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("ingrese primer numero: ");
        numero1  = entrada.nextInt();

        System.out.print("ingrese segundo numero: ");
        numero2 = entrada.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division );

*/
        //concatenacion de variables 

        Scanner entrada = new Scanner (System.in);

        int num1;

        System.out.println("ingrese primer numero: ");

        num1 = entrada.nextInt();

        num1 += num1 + 3;

        System.out.println("el numero es: " + num1);




    }
}

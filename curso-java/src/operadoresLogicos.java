import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {
        /* 
        Scanner entrada = new Scanner (System.in);

        int valor1;
        int valor2;

        System.out.println("ingrese primer numero: ");
        valor1 = entrada.nextInt();

        
        System.out.println("ingrese segundo numero: ");
        valor2 = entrada.nextInt();

       if(valor1 >= valor2){
        System.out.println(true);
       }else{
        System.out.println(false);
       }
       */
       int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}

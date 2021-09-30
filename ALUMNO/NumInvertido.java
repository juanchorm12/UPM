import java.util.Scanner;

public class Invertir {
    public static void (String[] args){
        int numOriginal, numInvertido, auxiliar, resto;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero a invertir ");
        numOriginal = teclado.nextInt();
        resto = numOriginal % 10;
        auxiliar = numOriginal / 10;
        numInvertido = resto*10 + auxiliar;
        System.out.print(" Numero original: ");
        System.out.println(" Numero invertido: " + numInvertido);
        teclado.close();
        
    
    }
       
    
}

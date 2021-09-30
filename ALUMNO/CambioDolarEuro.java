import java.util.Scanner;
public class Clase {
    public static void main(String[] args) {
        double tipoCambio = 1.18;
        double euros =0;
        double dolares = euros * tipoCambio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de euros: ");
        euros = teclado.nextDouble();
        dolares = euros * tipoCambio;
        System.out.println(euros + "€ valen " + dolares + "$");
        teclado.close();
       
    }

}

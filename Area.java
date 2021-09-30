import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        double base, altura, area, radio;
        final double PI = 3.4314159265;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        base = teclado.nextDouble();
        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();
        area = base * altura / 2;
        System.out.println("area = " + area);
        System.out.print("Introduzca la radio: ");
        radio = teclado.nextDouble();
        area = PI * radio * radio;
        System.out.println("Base de circulo = " +area);
        teclado.close();


    }

}

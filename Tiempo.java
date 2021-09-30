import java.util.Scanner;
public class Tiempo {
    public static void main (String[] args){

        int segundos, minutos, horas;
        int totalSegundos;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba una cantidad ");
        totalSegundos = teclado.nextInt();
        horas = totalSegundos / 3600;
        minutos = (totalSegundos - horas*3600) /60;
        segundos = totalSegundos - (horas*3600 + minutos*60) ;
        System.out.println(+totalSegundos+  " Segundos equivale a: " +horas+ "H  "+minutos+ "Min  "+segundos+ "Seg");
        teclado.close();


    }
}

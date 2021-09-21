package tema1.ejer; /**
 * Ejercicio 10.
 * Hacer un programa que escriba el área de un triángulo (a partir de
 * su base y altura) y  * de un circulo (a partir del radio), para ello pedirá que se
 * introduzcan por teclado  * los valores de correspondientes a cada figura.
 *
 * @version 1.0 14/09/2021
 * @author Asignatura Fundamentos de Programación (ETSISI - UPM)
 */
/*
Primera aproximacion:
- Calcular area de un triangulo
- Calcular area de un circulo

Segunda aproximacion:
- Calcular area de un triangulo
    - Definir variables (base, altura, area)
    - Leer variables (base, altura)
    - calcular area (base * altura / 2)
    - Escribir en pantalla area
- Calcular area de un circulo
    - Definir variable radio y constante PI
    - calcular area del circulo (radio, PI)
    - Escribnir en pantalla el area calculada del circulo
 */

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Definir variables
        double base, altura, area;
        // Definir la constante PI
        final double PI = 3.14159265;
        // Leer valores de base y altura desde el teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        base = teclado.nextDouble();
        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();
        // Calcular el area del triangulo
        area = base * altura / 2;
        System.out.println("Area: " + area);
        // Definir variable radio
        double radio;
        // Leer desde el teclado el valor de la variable radio
        System.out.print("Introduzca el radio del círculo: ");
        radio = teclado.nextDouble();
        // Calcular el area del circulo
        area = PI*radio*radio;
        System.out.print("Area: " + area);
        // Cerrar el objeto de lectura desde el teclado
        teclado.close();
    }
}


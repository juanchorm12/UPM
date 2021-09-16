public class Principal {
    public static void main(String[] args){
    int anioNacido, edad;
    boolean anioCorrecto;
    final int ANIO_ACTUAL = 2021;
    //Este comando permite lee la primera entrada de la
    //linea de comandos y convertirla en un numero entero
    anioNacido = Integer.parseInt(args[0]);
    anioCorrecto = anioNacido > 0 && anioNacido < ANIO_ACTUAL;
    edad = ANIO_ACTUAL - anioNacido;
    System.out.println("¿Año introducido correcto? "+anioCorrecto);
    //Si es el año correcto, se imprime la edad
    if (anioCorrecto)
        System.out.println("Si naciste en "+anioNacido+ " tienes " +edad);
    }

}

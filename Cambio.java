public class Cambio {
    public static void main(String[] args) {
        double cambio;
        int monedas;
        cambio = Double.parseDouble(args[0]);
        monedas = (int) cambio / 2;
        cambio = cambio - monedas * 2;
        System.out.println("Monedas de 2€: " + monedas);
        monedas = (int) cambio;
        cambio = cambio - monedas;
        System.out.println("Monedas de 1€: " + monedas);
        monedas =  (int) (cambio / 0.50);
        cambio = cambio - (double) monedas * 0.5;
        System.out.println("Monedas de 50cts: " + monedas);
        monedas = (int) (cambio / 0.20);
        cambio = cambio - (double) monedas * 0.2;
        System.out.println("Monedas de 20cts: " + monedas);
        monedas = 100 * (int) (cambio / 0.1);
        cambio = cambio - (double) monedas * 0.1;
        System.out.println("Monedas de 10cts: " + monedas);
        monedas = (int) (cambio / 0.05);
        cambio = cambio - (double) monedas * 0.05;
        System.out.println("Monedas de 5cts: " + monedas);
        monedas = (int) (cambio / 0.02);
        cambio = cambio - (double) monedas * 0.02;
        System.out.println("Monedas de 2cts: " + monedas);
        monedas = (int) cambio;
        System.out.println("Monedas de 1cént: " + monedas);
    }
}
/* 3.- Escriba un diagrama que lea un entero, y determine y muestre cuántos dígitos 7 tiene el número.
Sacchetti, Maria Giselle C2*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            numero =numero * (-1); //lo multiplico por -1 para que sea positivo
        }

        while (numero != 0) {
            if (numero % 10 == 7) {
                contador++;
            }
            numero = numero / 10;
        }

        System.out.println("El numero tiene " + contador + " digitos 7");
        scanner.close();
    }
}

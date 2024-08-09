package practice_classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        try (Scanner myScanner = new Scanner(System.in)) {
            int num1, num2;
            System.out.println("Ingrese el primer numero: ");
            num1 = myScanner.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            num2 = myScanner.nextInt();

            System.out.println("La suma de ambos numeros es: " + (num1 + num2));
        } catch (InputMismatchException ex) {
            System.out.println("Error al obtener el numero. Motivo: " + ex.toString());
            System.exit(0);
        }
    }
}

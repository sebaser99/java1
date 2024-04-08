package b3;

import java.util.Scanner;

//Crear una calculadora que funcione por consola pidiendo 2 datos
public class TrabajoEnClase2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        double division;

        System.out.println("Por favor ingrese 2 números");

        System.out.println("Ingrese el primer número");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2 = scanner.nextInt();
        division = (double) numero1 / numero2;
        System.out.println(numero1 + " + " + numero2 + " es " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " es " + (numero1 - numero2));
        System.out.println(numero1 + " x " + numero2 + " es " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " es " + division);

    }
}

package b6;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bienvenido a la Calculadora SebasCalc");
            System.out.println("Ingrese el primer número");
            double result = 0;
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el Segundo número");
            int num2 = scanner.nextInt();
            int operation;
            do {
                System.out.println("Elija la operación a realizar -- para sumar  1 , restar 2 , multiplicar 3 , dividir 4");
                operation= scanner.nextInt();
            } while (operation < 1 || operation > 4);

            switch (operation){
                case 1:
                        result = suma(num1, num2);
                    break;
                case 2:
                    result = resta(num1, num2);
                    break;
                case 3:
                    result = multipliacion(num1, num2);
                    break;
                case 4:
                    result = division(num1, num2);
                    break;
            }
            System.out.println("El resultado es " + result);
        } catch (Exception e){
            System.out.println("Se ha presentado el siguiente error" + e.getMessage());
        } finally {
            scanner.close();
        }




    }

    public static  int suma(int a, int b) {
        return a + b;
    }

    public static  int resta(int a, int b) {
        return a - b;
    }

    public static  int multipliacion(int a, int b) {
        return a * b;
    }

    public static  int division(int a, int b) {
        return a / b;
    }
}

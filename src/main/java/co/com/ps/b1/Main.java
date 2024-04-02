package co.com.ps.b1;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int edad = 16;
        double fracciones = 1.2;
        boolean esVerdad = true;
        short numeroPequeno = 60;
        char letra = 'a';

        Date fecha = new Date();
        LocalDate localDate = LocalDate.now();

        System.out.println(edad);
        System.out.println(fracciones);
        System.out.println(esVerdad);
        System.out.println(numeroPequeno);
        System.out.println(letra);
        System.out.println(fecha);
        System.out.println(localDate);
    }
}
package b6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(1991, 11, 06);

        int anioActual = fechaActual.getYear();
        int anioNacimiento = fechaNacimiento.getYear();
        int mesActual = fechaActual.getMonthValue();
        int mesNacimiento = fechaNacimiento.getMonthValue();
        int anios;


        System.out.println(anioActual);
        System.out.println(anioNacimiento);
        anios = anioActual - anioNacimiento;
        if(mesActual < mesNacimiento) {
            System.out.println("Tengo " + (anios - 1) + " años");
        } else {
            System.out.println("Tengo " + anios  + " años");
        }



        int anio = fechaActual.getYear();
        int month = fechaActual.getMonthValue();
        int day = fechaActual.getDayOfMonth();

        fechaActual.plusDays(1);
        fechaActual.minusDays(1);

        boolean esIgual = fechaActual.isEqual(fechaNacimiento);
        boolean esAntes = fechaActual.isBefore(fechaNacimiento);
        boolean esDespues = fechaActual.isAfter(fechaNacimiento);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String fechaFormateada = fechaActual.format(formatter); //formatear la fecha como una cadena

        LocalDate fechaParseada = LocalDate.parse("31/12/2022", formatter); //convierte una cadena a local date


    }
}

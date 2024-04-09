package b3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
         Colombiano colombiano = new Colombiano("1151943575", "Alex",
                                     "Rodriguez", "cédula", "O+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("Sebastian");
        System.out.println(colombiano.getNombre());
        System.out.println(colombiano.getApellido());


        //<----------------------------------------------------------------------------------->
        int edad = 36;
        double fracciones = 1.2;
        boolean esVerdad = false;
        short numeros = 60;
        char letra = 'a';
        Integer edad2= 18;
        Boolean esFalso=false;

        Date fecha = new Date();
        LocalDate fechaLocal = LocalDate.now();
        System.out.println(edad);

        //<---------------------------------------------------------------------------------->
        int numero=10;

        if(numero > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo o cero");
        }

        int dia=3; //día 3
        String nombreDia = "";

        switch (dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3 :
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
            case 5 :
                nombreDia = "Viernes";
                break;
            case 6 :
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día válido";
                break;
        }

        System.out.println("El día " + " es " + nombreDia);

        //<---------------------------------------------------------------------------------->
        List<String> lista = new ArrayList<>();
        String[] miArreglo = new String[2];
        String[] miArreglo2 = {"hola", "Como estas"};
        miArreglo2[0] = "Hola qué tal";
    }
}

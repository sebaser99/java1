package b5;

public class Main {
    public static void main(String[] args){
        DiaSemana dia = DiaSemana.LUNES;

        if(dia == DiaSemana.DOMINGO || dia == DiaSemana.LUNES){
            System.out.println("Es día de trabajar");
        } else {
            System.out.println("Hoy se descansa");
        }
    }
}

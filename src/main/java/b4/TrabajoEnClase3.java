package b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {

    public static void main(String[] args){
        List<String> palabras = new ArrayList<>();
        List<String> palabrasMas4 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese 4 palabras");
        for(int i = 0; i < 4; i++){
            System.out.println("Digite la palabras # " +  (i + 1));
            palabras.add(scanner.next());
        }

        for(int i = 0; i < 4; i++){
            if(palabras.get(i).length() > 4){
                palabrasMas4.add(palabras.get(i));
            }
        }
        if(!palabrasMas4.isEmpty()){
            if(palabrasMas4.size() > 1) {
                System.out.println("La palabras con más de 4 letras son ");
            } else {
                System.out.println("La palabra con más de 4 letras es ");
            }
            for(int i = 0; i < palabrasMas4.size(); i++){
                System.out.println(palabrasMas4.get(i));

            }
        } else {
            System.out.println("Ninguna palabra tiene más de 4 letras");
        }
    }
}

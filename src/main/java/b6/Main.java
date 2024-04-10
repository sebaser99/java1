package b6;

public class Main {
    public static void main(String[] args ){
        /*int num = 1 /0;
        System.out.println(num);

        int[] arreglo = new int[3];
        System.out.println(arreglo[3]);
         */
        try {
            int resultado = dividir(10, 0);
            System.out.println(resultado);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("La aplicación terminó con éxito");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}

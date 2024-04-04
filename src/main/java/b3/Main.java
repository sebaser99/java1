package b3;

public class Main {
    public static void main(String[] args){
         Colombiano colombiano = new Colombiano("1151943575", "Alex",
                                     "Rodriguez", "cédula", "O+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("Sebastian");
        System.out.println(colombiano.getNombre());
        System.out.println(colombiano.getApellido());

    }
}

package b2;

public class TrabajoEnClase1 {
    String Marca;
    String modelo;
    String cilindraje;
    Boolean esElectrica;
    int numeroDeLLantas;
    int numeroDeValvulas;
    String color;
    String tipoCombustible;
    String p;

    public void encender(){
        System.out.println("Encendiendo motocicleta");
    }
    public String mostrarPlaca(String placa){
        System.out.println("El número de placa es" + this.p);

        return this.p;
    }
    public int mostrarNumeroValvulas(String placa){
        System.out.println("El número de válvulas es" + this.numeroDeValvulas);

        return this.numeroDeValvulas;
    }

    public void cambiarNumeroDePlaca(String numeroDePlaca){
        this.p = numeroDePlaca;
    }

}


package b2;

public class Persona {
    String nombre;
    String id;
    int edad;
    String sexo;
    float estatura;
    String colorPiel;
    String telefono;

    Persona(){}

    Persona(String nombre, int edad, String id, float estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.estatura = estatura;
    }

    public static void cantar(){
        System.out.println("Estoy cantando");
    };

    public void bailar(){
        System.out.println("Estoy bailando");
    }

    public int caminar(int cuadras){
        return cuadras * 100;
    }

}

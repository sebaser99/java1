package b2;

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona();
       persona1.nombre = "Sebastian Rodriguez";
       persona1.edad = 32;
       persona1.id = "12345678";
       persona1.estatura = 1.76f;

       persona1.caminar(3);
       persona1.bailar();
       Persona.cantar();

       Persona persona2 = new Persona("Camilo", 18, "123455", 1.75f);
       Persona persona3 = new Persona("Daniel", 32, "1234545", 1.90f);
       Persona persona4 = new Persona("Carol", 24, "123434", 1.62f);
       var persona5 = new Persona("Camila", 23, "123422", 1.68f);
    }
}

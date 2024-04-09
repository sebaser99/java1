package b5;

public enum DiaDeLaSemana {

    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);

    private final int valor;

    DiaDeLaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}

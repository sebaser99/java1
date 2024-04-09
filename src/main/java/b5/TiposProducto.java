package b5;

public enum TiposProducto {

    ASEO(0.25), FARMACEUTICOS(0.10), CARNES(0.20), GRANOS(0.16), VERDURAS(0.14), LICOR(0.2), ROPA(0.35), AGRICOLA(0.08);

    private final double valor;

    TiposProducto(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

}

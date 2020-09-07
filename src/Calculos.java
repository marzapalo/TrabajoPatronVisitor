public class Calculos implements Visitor{
    private final double impuestoNormal = 0.18;
    private final double impuestoReducido=0;
    private final double descuento=0.20;

    public double visit(ProductoNormal normal){
        return normal.getPrecio()*impuestoNormal;
    }

    public double visit(ProductoDescuento reducido){
        return reducido.getPrecio()*impuestoReducido;
    }

    public double visit(ProductoBonificacion bonificacion){
        return bonificacion.getPrecio()*descuento;
    }
}

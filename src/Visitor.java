public interface Visitor {
    public double visit (ProductoNormal normal);
    public double visit (ProductoDescuento reducido);
    public double visit (ProductoBonificacion bonificacion);
}

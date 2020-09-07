public class PatronVisitor {
    public static void main(String[] args) {
        int producto01 = 100;
        int producto02 = 100;
        int producto03 = 100;

        ProductoDescuento producto1 = new ProductoDescuento();
        producto1.setPrecio(producto01);

        ProductoNormal producto2 = new ProductoNormal();
        producto2.setPrecio(producto02);

        ProductoBonificacion producto3 = new ProductoBonificacion();
        producto3.setPrecio(producto03);

        Calculos calculo =new Calculos();
        double resultado1=producto1.accept(calculo);
        double resultado2=producto2.accept(calculo);
        double resultado3=producto3.accept(calculo);

        System.out.println("Precio: " + producto01);
        System.out.println("producto01: Resultado Precio Normal igv(18%): " + (producto02-resultado2));

        System.out.println("Precio: " + producto02);
        System.out.println("producto02: Resultado Precio Exonerado  igv(0%): " + (producto02-resultado1));

        System.out.println("Precio: " + producto03);
        System.out.println("producto03: Resultado Precio con Bonificacion igv(18%)- desc(20%): " + (producto03-resultado2-resultado3));

    }
}


Patrón Visitor

a.- El patrón Visitor es un patrón de comportamiento, el patrón se utiliza cuando las clases que tienen la estructura de objetos no cambian pero las operaciones que se llevan a cabo entre ellas si pueden cambiar.
b.- Cuando varias clases de objetos con interfaces diferentes y se desean realizar operaciones que dependen de sus clases concretas. 
c.- También cuando se necesitan diversas operaciones sobre objetos de una jerarquía y no se desea recargar las clases con estas operaciones.
Del Trabajo realizado:
El caso planteado es una farmacia donde todos los productos pagan IGV, algunos medicamentos tienen bonificaciones y otros productos se exoneran del IGV. Para este caso usaremos el Patrón visitor para la solución del problema.
1.	Primero implementaremos una interfaz donde se ubicara el método accept() .
2.	Luego, crearemos 03 clases para los productos que harán las veces de ProductoNormal, ProductoDescuento y ProductoBonificacion q vienen hacer nuestros elementos concretos.
3.	Luego, se implementa la clase Calculos que estaría representada por la clase Visitante, que incluye 03 métodos, uno por cada clase que tenga que ser visitada, es decir pasa por el parámetro el Elemento Concreto que corresponde.
a.	Método ProductoNormal
b.	Método ProductoDescuento
c.	Método ProductoBonificacion
4.	Como último paso, se instancia los objetos para la implementación del patrón visitor en el main().

Explicación sencilla:
La farmacia no tiene saber que producto es y ni saber que descuentos tiene, es el propio producto es el que le dice que tipos de descuentos tiene. La farmacia solo visita al producto y le agrega el descuento. 


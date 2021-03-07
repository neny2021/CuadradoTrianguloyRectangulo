package ejercicio;

/**
 * Implementar el patrón de diseño factory para la creación de
 * figuras geométricas.
 *
 * @author Jennifer Cordon
 */
public class AplicacionFactory {

    public static void main(String[] args) {

        Figura figura = FiguraFactory.crearFigura(TipoFigura.TRIANGULO);
        Triangulo triangulo = (Triangulo) figura;
        triangulo.setBase(5);
        triangulo.setAltura(3);
        System.out.println("Triángulo:");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Área: " + figura.calcularArea());

        System.out.println();

        figura = FiguraFactory.crearFigura(TipoFigura.RECTANGULO);
        Rectangulo rectangulo = (Rectangulo) figura;
        rectangulo.setAncho(7);
        rectangulo.setAlto(10);
        System.out.println("Rectángulo:");
        System.out.println("Base: " + rectangulo.getAncho());
        System.out.println("Altura: " + rectangulo.getAlto());
        System.out.println("Área: " + figura.calcularArea());

        System.out.println();

        figura = FiguraFactory.crearFigura(TipoFigura.CUADRADO);
        Cuadrado cuadrado = (Cuadrado) figura;
        cuadrado.setLado(5);
        System.out.println("Cuadrado:");
        System.out.println("Lados: " + cuadrado.getLado());
        System.out.println("Área: " + figura.calcularArea());

        System.out.println();
    }
}
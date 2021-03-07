package ejercicio;

/**
 * FiguraFactory.
 *
 * @author Jennifer Cordon
 */
public class FiguraFactory {

    public static Figura crearFigura(TipoFigura tipoFigura) {
        return switch (tipoFigura) {
            case TRIANGULO -> new Triangulo();
            case RECTANGULO -> new Rectangulo();
            default -> new Cuadrado();
        };
    }
}
package ejercicio;

/**
 * Cuadrado.
 *
 * @author Jennifer Cordon
 */
public class Cuadrado extends Figura {

    public double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }    
}
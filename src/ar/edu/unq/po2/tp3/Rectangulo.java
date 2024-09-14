package ar.edu.unq.po2.tp3;

public class Rectangulo {
    
    private Point abajoIzquierda;  //Punto a partir del que se genera el rectangulo
    private int ancho; //Ancho del rectangulo
    private int altura;  //Altura del rectangulo

    // Constructor con parámetros
    public Rectangulo(Point abajoIzquierda, int ancho, int altura) {
        if (ancho <= 0 || altura <= 0) {
        	throw new RectanguloException("El ancho y la altura deben ser positivos.");
        }
        this.abajoIzquierda = abajoIzquierda;
        this.ancho = ancho;
        this.altura = altura;
    }

    public Point getAbajoIzquierda() {
        return abajoIzquierda;
    }

    public void setAbajoIzquierda(Point abajoIzquierda) {
        this.abajoIzquierda = abajoIzquierda;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho <= 0) {
            throw new RectanguloException("El ancho debe ser un valor positivo.");
        }
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
        	throw new RectanguloException("La altura debe ser un valor positivo.");
        }
        this.altura = altura;
    }

    public int calcularArea() {
        return this.ancho * this.altura;
    }

    public int calcularPerimetro() {
        return (2 * this.ancho) + (2 * this.altura);
    }
    
    public Boolean esHorizontal() {
        return this.ancho > this.altura;
    }
    
    public Boolean esVertical() {
        return !this.esHorizontal();
    }
}
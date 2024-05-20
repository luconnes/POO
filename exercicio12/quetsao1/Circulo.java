
public class Circulo {
    private double raio;
    private final double pi = 3.14;
    private double area;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public void calcularArea() {
        this.area = (this.raio * this.raio) * pi;
    }

    // Getters e setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

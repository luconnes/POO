package exercicio_7;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Double> areas = new HashSet<>();

        Circulo area1 = new Circulo(13.2);
        area1.calcularArea();
        Circulo area2 = new Circulo(11.2);
        area2.calcularArea();
        Circulo area3 = new Circulo(16.2);
        area3.calcularArea();
        Circulo area4 = new Circulo(1.2);
        area4.calcularArea();
        Circulo area5 = new Circulo(0.2);
        area5.calcularArea();

        areas.add(area1.getArea());
        areas.add(area2.getArea());
        areas.add(area3.getArea());
        areas.add(area4.getArea());
        areas.add(area5.getArea());

        System.out.println(areas);
    }
}


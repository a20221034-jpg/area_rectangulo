package org.example;

public class Main {
    public static void main(String[] args) {
        int base = 8;
        int altura = 4;

        int area = calcularArea(base, altura);
        int perimetro = calcularPerimetro(base, altura);

        System.out.println("Rectángulo de base " + base + " y altura " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    // Método que calcula el área
    public static int calcularArea(int base, int altura) {
        return base * altura;
    }

    // Método que calcula el perímetro
    public static int calcularPerimetro(int base, int altura) {
        return 2 * (base + altura);
    }
}

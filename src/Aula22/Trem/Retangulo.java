package Aula22.Trem;

public class Retangulo extends Figura {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.largura;
    }
}

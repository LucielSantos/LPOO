package Aula2.Atividade.um;

import java.util.Scanner;

public class Triangulo {
    private Scanner read = new Scanner(System.in);

    private double base;
    private double altura;

    public void ler(){
        System.out.println("Insira o valor da base do Triângulo: ");
        this.base = read.nextDouble();

        System.out.println("Insira o valor da altura do Triângulo: ");
        this.altura = read.nextDouble();
    }

    public void exibeInfo(){
        System.out.println("Base do Triângulo: " + this.base);
        System.out.println("Altura do Triângulo: " + this.altura);
    }

    public double calculaArea(){
        return (this.base * this.altura) / 2;
    }
}

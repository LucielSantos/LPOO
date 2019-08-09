package Aula2.Atividade.um;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.ler();
        System.out.println("-----------------");
        triangulo.exibeInfo();
        System.out.println("-----------------");
        System.out.println(triangulo.calculaArea() + "m²");
    }
}

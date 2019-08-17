package Aula2;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro.ler();
        livro.aplicarDesconto(10);
        livro.mostrar();
    }
}
package Aula2;

import java.util.Objects;
import java.util.Scanner;

public class Livro {
    Scanner read = new Scanner(System.in);

    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;

    public Livro() {
        this.autor = new Autor();
    }

    public void mostrar() {
        System.out.println("------------------------------------------");
        System.out.println("Titulo: " + this.nome);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("------------------------------------------");
    }

    public void ler(){
        System.out.println("------------------------------------------");
        System.out.println("Digite o nome do livro: ");
        this.nome = read.nextLine();
        System.out.println("Digite o Valor do livro: ");
        this.valor = read.nextDouble();
        System.out.println("Digite o ISBN do livro: ");
        this.isbn = read.next();
        System.out.println("Digite a descrição do livro: ");
        this.descricao = read.next();

        this.autor.ler();
    }

    public void aplicarDesconto(double percentual){
        this.valor -= this.valor*(percentual/100);
    }

    public double retornaDescontoDado (double percentual){
        double desconto = this.valor*(percentual/100);
        this.valor -= this.valor*(percentual/100);
        return desconto;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return isbn.equals(livro.isbn);
    }
}

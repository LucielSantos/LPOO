package Aula2;

import java.util.Scanner;

public class Autor {
    Scanner read = new Scanner(System.in);

    String nome;
    String email;
    String cpf;

    public void ler(){
        System.out.println("Insira o nome do autor: ");
        this.nome = read.nextLine();
        System.out.println("Insira o email do autor: ");
        this.email = read.nextLine();
        System.out.println("Insira o cpf do autor: ");
        this.cpf = read.nextLine();
    }
}

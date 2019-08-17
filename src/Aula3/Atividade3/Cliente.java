package Aula3.Atividade3;

import java.util.Scanner;

public class Cliente {
    Scanner read = new Scanner(System.in);

    private String cpf;
    private String nome;
    private int idade;

    Cliente(){
        System.out.println("Informe o CPF do titular: ");
        this.cpf = read.nextLine();
        System.out.println("Informe o Nome do titular: ");
        this.nome = read.nextLine();
        System.out.println("Informe a Idade do titular: ");
        this.cpf = read.nextLine();
    }
}

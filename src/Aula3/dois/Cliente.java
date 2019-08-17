package Aula3.dois;

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
        this.setNome(this.getNome().toUpperCase());
        System.out.println("Informe a Idade do titular: ");
        this.idade = read.nextInt();
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + this.cpf + '\'' +
                ", nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

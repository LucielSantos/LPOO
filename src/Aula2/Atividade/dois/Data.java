package Aula2.Atividade.dois;

import java.util.Scanner;

public class Data {
    private Scanner read = new Scanner(System.in);

    private int dia;
    private int mes;
    private int ano;

    public void ler(){
        System.out.println("Insira o dia: ");
        this.dia = read.nextInt();
        System.out.println("Insira o mês: ");
        this.mes = read.nextInt();
        System.out.println("Insira o ano: ");
        this.ano = read.nextInt();

        this.verificaDados();
    }

    public void verificaDados(){
        boolean verif = false;
        do {
            if (!verificaDia()){
                System.out.println("Insira o dia Corretamente: ");
                this.dia = read.nextInt();
                verif = false;
            }

            if (!verificaMes()){
                System.out.println("Insira o mês Corretamente: ");
                this.mes = read.nextInt();
                verif = false;
            }

            if (!verificaAno()){
                System.out.println("Insira o ano corretamente: ");
                this.ano = read.nextInt();
                verif = false;
            }

            if (verificaDia() && verificaMes() && verificaAno()) verif = true;
        }while (!verif);

    }

    public boolean verificaDia(){
        if (this.dia > 31 || this.dia < 1) return false;

        if (this.dia == 31 && this.mes == 2) return false;

        return true;
    }

    public boolean verificaMes(){
        if (this.mes > 12 || this.mes < 1) return false;

        return true;
    }

    public boolean verificaAno(){
        if (this.ano < 1) return false;

        return true;
    }

    public void mostra(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}

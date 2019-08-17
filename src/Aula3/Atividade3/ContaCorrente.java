package Aula3.Atividade3;

import java.util.Scanner;

public class ContaCorrente {
    Scanner read = new Scanner(System.in);

    private int saldo;
    private double numero;
    private String senha;
    private Cliente titular;

    ContaCorrente(){
        this.titular = new Cliente();

        this.numero++;

        System.out.println("Informe a sua senha da conta: ");
        this.senha = read.nextLine();
    }

    public void deposito( double valor){
            this.saldo += valor;
    }

    public boolean saque(double saque){
        if (validaSaldo(saque)){
            this.saldo -= saque;
            return true;
        }else {
            return false;
        }
    }

    public boolean transferir(ContaCorrente destinatario, double valor){

        if (!validaSaldo(valor)){
            return false;
        }

        this.saque(valor);
        destinatario.deposito(valor);

        return true;
    }

    private boolean validaSaldo(double valor){
        if (valor > this.saldo){
            return false;
        }else {
            return true;
        }
    }

    public void mostraSaldo(){
        System.out.println("Saldo: R$ "+ this.saldo);
    }
}

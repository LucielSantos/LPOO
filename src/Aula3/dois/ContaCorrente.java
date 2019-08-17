package Aula3.dois;

import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente {

    Scanner read = new Scanner(System.in);

    private double saldo;
    private int numero;
    private String senha;
    private Cliente titular;
    private double limite;

    ContaCorrente(){
        this.titular = new Cliente();

        this.setNumero(this.calculaNumero());

        System.out.println("Informe a sua senha da conta: ");
        setSenha(read.nextLine());

        System.out.println("Seu Número da conta é: " + this.getNumero());

        this.setLimite(this.calculaLimite());

    }

    private double calculaLimite(){
        if (this.titular.getIdade() > 60){
            return 300;
        }else {
            return 200;
        }
    }

    private int calculaNumero(){
        return  1 + (int) (Math.random() * 10);
    }

    public void deposito( double valor){
        this.saldo += valor;
    }

    public boolean saque(double saque){
        if (validaSaldo(saque)){
            this.setSaldo(this.getSaldo() - saque);
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
        if (valor < (this.getSaldo() + this.getLimite())){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return Objects.equals(titular.getCpf(), that.titular.getCpf());
    }

    //  geters and seters

    public void mostraSaldo(){
        System.out.println("Saldo: R$ "+ this.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + this.getSaldo() +
                ", numero=" + this.getNumero() +
                ", senha='" + this.getSenha() + '\'' +
                ", titular=" + this.titular +
                ", limite=" + this.getLimite() +
                '}';
    }
}

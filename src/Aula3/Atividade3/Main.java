package Aula3.Atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.deposito(100);

        conta1.saque(50);

        conta1.mostraSaldo();

        conta1.transferir(conta2, 30);
    }
}

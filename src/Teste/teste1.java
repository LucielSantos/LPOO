package Teste;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("OI GALERAA!!");
        int num1, num2;
        String nome;

        System.out.println("Numero 1: ");
        num1 = read.nextInt();

        System.out.println("Numero 2: ");
        num2 = read.nextInt();

        System.out.println("Soma: " + (num1+num2));
    }
}
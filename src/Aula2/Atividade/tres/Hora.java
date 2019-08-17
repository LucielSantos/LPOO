package Aula2.Atividade.tres;

import java.util.Scanner;

public class Hora {
    Scanner read = new Scanner(System.in);

    private int hora;
    private int minuto;
    private int segundo;

    public void ler(){
        System.out.println("Insira a Hora: ");
        this.hora = read.nextInt();

        System.out.println("Insira o Minuto: ");
        this.minuto = read.nextInt();

        System.out.println("Insira o Segundo: ");
        this.segundo = read.nextInt();

        verifica();
        transformaMinuto();
        transformaSegundo();
    }

    public void verifica(){
        boolean verif = false;
        do {

            if (!verificaHora()){
                System.out.println("Insira Corretamente a Hora: ");
                this.hora = read.nextInt();
            }

            if (!verificaMinuto()){
                System.out.println("Insira Corretamente o Minuto: ");
                this.minuto = read.nextInt();
            }

            if (!verificaSegundo()){
                System.out.println("Insira o Segundo Corretamente: ");
                this.segundo = read.nextInt();
            }

            if (verificaHora() && verificaMinuto() && verificaSegundo()){
                verif = true;
            }

        }while (verif = false);
    }

    public boolean verificaHora (){
        if (this.hora < 0) return false;

        return true;
    }

    public boolean verificaMinuto (){
        if (this.minuto < 0) return false;

        return true;
    }

    public boolean verificaSegundo (){
        if (this.segundo < 0) return false;

        return true;
    }

    public void transformaMinuto(){
        if (this.minuto >= 60){
            this.hora++;
            this.minuto -= 60;
            this.transformaMinuto();
        }
    }

    public void transformaSegundo(){
        if (this.segundo >= 60){
            this.minuto++;
            this.segundo -= 60;
            this.transformaSegundo();
        }
    }

    public void mostrar(){
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }
}

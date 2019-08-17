package Aula3.dois;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        ArrayList <ContaCorrente> contas =  new ArrayList<ContaCorrente>();

        contas.add(new ContaCorrente());

        ContaCorrente conta2 = new ContaCorrente();

        for (int i = 0; i < contas.size(); i++){
            if (contas.get(i).equals(conta2)){
                System.out.println("Contas com o mesmo Titular!");
                break;
            }
            if (i == contas.size()-1){
                contas.add(conta2);
            }
        }

        System.out.println(contas.toString());

        contas.get(0).deposito(100);
        contas.get(0).transferir( contas.get(1), 200);

        contas.get(0).mostraSaldo();
        contas.get(1).mostraSaldo();
    }
}


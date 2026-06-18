package Basico;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Hoje falo com o senhor ? :");
        String nome = teclado.next();
        System.out.print("Quanto de saldo o senhor tem no banco:");
        int saldo = teclado.nextInt();
        System.out.println("Então o senhor " + nome + " tem R$:" + saldo + " de saldo ");
        System.out.print("Quanto voçê gostaria de sacar: ?");
        int saque= teclado.nextInt();
        int resultado=saldo - saque;
        System.out.println("Então o senhor vai ficar com o saldo de R$:"+resultado);

    }

}

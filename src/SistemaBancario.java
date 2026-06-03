import java.util.Scanner;

public class SistemaBancario {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Hoje falo com o senhor ? :");
            String nome = teclado.next();
            System.out.print("Quanto de saldo o senhor tem no banco:");
            int saldo = teclado.nextInt();
            System.out.println("Então o senhor " + nome + " tem R$:" + saldo + " de saldo ");
            System.out.print("Quanto voçê gostaria de sacar: ?");
            int saque= teclado.nextInt();
            // Uso do if para que se caso do saque for maior que o saldo mostrar a mensagem "Saldo insuficiente"
                if (saldo<saque){
                     System.out.println("Saldo insuficiente ");
            }
            int resultado=saldo - saque;
            // Usei da variavel resultado para poder ficar mais facil obter o resultado de saque do cliente
            System.out.println("Então o senhor vai ficar com o saldo de R$:"+resultado);

        }

    }


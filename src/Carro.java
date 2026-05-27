import java.util.Scanner;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro meuCarro = new Carro();

        System.out.println("Qual a marca do seu carro?");
        meuCarro.marca= teclado.next();

        System.out.println("Qual o modelo?");
        meuCarro.modelo= teclado.next();

        System.out.println("Qual o ano");
        meuCarro.ano= teclado.nextInt();

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
    }
}
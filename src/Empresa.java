import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Entre com a temperatura :");
        float temperatura= teclado.nextFloat();
        if (temperatura>18&&temperatura<=45){
            System.out.println("Temperatura normal !");
        }else{
            System.out.println("Temperatura fora dos parametros !");
        }
        System.out.println("Entre com a umidade :");
        short umidade= teclado.nextShort();
        if (umidade>=30){
            System.out.println("Umidade ok!");
        }else{
            System.out.println("Umidade anormal ");
        }
        System.out.println("Entre com estoque: ");
        double estoque= teclado.nextDouble();
        if (estoque>=100){
            System.out.println("estoque cheio");
        }
    }
}

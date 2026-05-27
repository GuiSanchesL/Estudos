import java.util.Scanner;

public class UsoDoArreylist {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Qual a Sua idade ?");
        int idade= teclado.nextInt();
        if (idade>=18&&idade<=70){
            System.out.println("Voto Obrigatorio");
        }else{
            System.out.println("Não vota");
        }



    }


}




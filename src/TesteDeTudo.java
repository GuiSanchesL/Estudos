import java.util.Scanner;

public class TesteDeTudo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Qual a Sua idade ?");
        int idade= teclado.nextInt();
        if (idade>=18&&idade<=70){
            //uso do && como "E", Querendo dizer que 18 e 70 tem que cumprir o if
            System.out.println("Voto Obrigatorio");
        }else{
            System.out.println("Não vota");
        }



    }


}




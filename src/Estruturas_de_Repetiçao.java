public class Estruturas_de_Repetiçao {
    public static void main(String[] args) {
        //While é comumente usada para qundo não se sabe quantas vezes se vai repetir
        // For é usado quando se sabe quantas vezes a estrutura vai se repetir
        /*int num=0;
        while (num<10){
            System.out.println(num);
            num++;
        }*///Uso do While
        for (int num=0; num<10; --num){
            num++;
            System.out.println(num);
        }
    }
}

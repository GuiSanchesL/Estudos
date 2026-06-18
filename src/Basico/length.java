package Basico;

public class length {
    public static void main(String[] args) {
        int [][] filas= new int[4][4];

        filas [0][1]=10;
        filas [0][2]=20;
        filas [0][3]=30;
        filas [1][4]=40;

        // Uso de dois [] sempre bom criar duas variaveis
        // uso do .Basico.length para saber quantas posioçoes aquele array tem
        //Diferente do Arraylist que é melhor quando voçê nao sabe o tamanho.
        for (int p = 0; p < filas.length; p++)
        { for (int c=0; c< filas[c].length; c++){
            System.out.println(filas[p][c]);

        }



        }
    }
}

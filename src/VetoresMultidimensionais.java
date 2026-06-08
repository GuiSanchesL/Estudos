import java.util.Scanner;

public class VetoresMultidimensionais {
    public static void main(String[] args) {

        int [][] idades=new int[3][3];

        idades[0][0]=25;
        idades[0][1]=19;
        idades[0][2]=33;

        idades[1][0]=0;
        idades[1][1]=0;
        idades[1][2]=0;

        //Para toda repetição, length"Serve para saber quantas pocisoes tem"
        for (int i =0; i<idades.length; i++){
             for (int j = 0;j<idades[i].length;j++){
                 System.out.println(idades[i][j]);
             }
         }
        System.out.println("-----------------------");
         for (int[] arrbase: idades){
             for (int num: arrbase){
                 System.out.println(num);
             }
         }

    }

}


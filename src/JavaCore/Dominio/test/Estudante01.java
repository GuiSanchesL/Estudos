package JavaCore.Dominio.test;

import JavaCore.Dominio.Estudante;


public class Estudante01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Gabriel";
        estudante.idade = 14;
        estudante.sexo = 'm';
        estudante.altura =1.67;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.altura);
    }
}

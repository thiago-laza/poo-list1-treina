package exercicio02v2;

import exercicio02v1.Quadrado;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Instanciando a classe Quadrado para obter o objeto quadrado
        Quadrado quadrado = new Quadrado();

        //Atribuindo valor ao atributo a partir do input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lado: ");
        quadrado.lado = scanner.nextDouble();

        //Aplicando o metodo valorLado
        System.out.println("Lado: " + quadrado.valorLado() + " cm");

        //Aplicando o metodo calculaArea
        System.out.println("Area: " + quadrado.calculaArea(quadrado.lado) + " cm²");

        System.out.println("--------------------");

        //Aplicando o metodo mudaLado
        System.out.print("Novo lado: ");
        double novoLado = scanner.nextDouble();
        quadrado.mudaLado(novoLado);
        System.out.println("Novo lado: " + quadrado.lado +" cm");
        System.out.println("Nova area: " + quadrado.calculaArea(quadrado.lado) + " cm²");
    }
}

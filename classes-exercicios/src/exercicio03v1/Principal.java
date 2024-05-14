package exercicio03v1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Gerando "linhas" para organizar as partes do programa
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Instanciando a classe Retangulo para obter o objeto retangulo
        Retangulo retangulo = new Retangulo();

        //Atribuindo valor aos atributos por input
        System.out.println(linhaHifen);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Medida do lado A: ");
        retangulo.ladoA = scanner.nextDouble();
        System.out.print("Medida do lado B: ");
        retangulo.ladoB = scanner.nextDouble();

        //Aplicando o metodo valoraLados
        retangulo.valorLados(retangulo.ladoA, retangulo.ladoB);

        //Aplicando o metodo calculaArea
        System.out.println("Area: " + retangulo.calculaArea() + " cm²");

        //Aplicando o metodo calculaPerimetro
        System.out.println("Perimetro: " + retangulo.calculaPerimetro() + " cm");

        System.out.println(linhaHifen);

        //Aplicando o metodo mudaValorLados
        System.out.print("Nova medida do lado A: ");
        retangulo.ladoA = scanner.nextDouble();
        System.out.print("Nova medida do lado B: ");
        retangulo.ladoB = scanner.nextDouble();
        retangulo.mudaValorLados(retangulo.ladoA, retangulo.ladoB);
        retangulo.valorLados(retangulo.ladoA, retangulo.ladoB);
        System.out.println("Nova area: " + retangulo.calculaArea() + " cm²");
        System.out.println("Perimetro: " + retangulo.calculaPerimetro() + " cm");

        System.out.println(linhaHifen);

        //Solicitando ao usuario as dimensoes de um determinado local
        System.out.println("Informe as dimensoes do local: ");
        System.out.print("Lado 1: ");
        double ladoUm = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double ladoDois = scanner.nextDouble();
        double areaRegiao = ladoUm * ladoDois;
        double quantidadePisos = areaRegiao / retangulo.calculaArea();
        System.out.println("Numero de pisos: " + quantidadePisos);
    }
}

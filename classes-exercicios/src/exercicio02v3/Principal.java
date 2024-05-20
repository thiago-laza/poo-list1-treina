package exercicio02v3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        Scanner scanner = new Scanner(System.in);

        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        System.out.println(linhaHifen);

        System.out.print("Lado: ");
        quadrado.setLado(scanner.nextDouble());

        System.out.println(linhaHifen);

        System.out.println("Lado: " + quadrado.getLado() + " m");
        System.out.println("Area: "+ quadrado.area(quadrado.getLado()) + " m²");

        System.out.println(linhaHifen);

        System.out.print("Novo lado: ");
        quadrado.setLado(scanner.nextDouble());

        System.out.println(linhaHifen);

        quadrado.area(quadrado.getLado());

        System.out.println("Lado: " + quadrado.getLado() + " m");
        System.out.println("Area: "+ quadrado.area(quadrado.getLado()) + " m²");

        System.out.println(linhaHifen);

        

    }
    

    

    
}

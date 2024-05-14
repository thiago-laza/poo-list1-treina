package exercicio04v1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        System.out.println(linhaHifen);

        System.out.println("Nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.println("Idade: ");
        pessoa.idade = scanner.nextInt();
        System.out.println("Peso: ");
        pessoa.peso = scanner.nextDouble();
        System.out.println("Altura: ");
        pessoa.altura = scanner.nextDouble();

        while (true){
            System.out.println("Escolha uma das opcoes abaixo: ");
            
        }


    }
}

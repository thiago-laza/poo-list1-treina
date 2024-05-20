package exercicio04v1;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        
        System.out.print("Nome: ");
        pessoa1.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        pessoa1.setIdade(scanner.nextInt());
        System.out.print("Peso: ");
        pessoa1.setPeso(scanner.nextDouble());
        System.out.print("Altura: ");
        pessoa1.setAltura(scanner.nextDouble());

        System.out.println(linhaHifen);

        pessoa1.Pessoa();
        
        System.out.println(linhaHifen);


        while (true) {
            System.out.println(linhaHifen);
            System.out.print("Escolha uma das opcoes abaixo: \n" +
            "Envelhecer[1]\n"+
            "Engordar[2]\n"+
            "Emagrecer[3]\n"+
            "Crescer[4]\n"+
            "Sair[0]\n" +
            "Opcao: ");
            int opcoes = scanner.nextInt();
            if (opcoes == 1) {
                System.out.print("Anos a envelhecer: ");
                int anos = scanner.nextInt();
                pessoa1.envelhecer(anos);
                System.out.println(linhaHifen);
                pessoa1.Pessoa();
            }else if (opcoes == 2) {
                System.out.print("Quilos a engordar: ");
                double quilos = scanner.nextDouble();
                pessoa1.engordar(quilos);
                System.out.println(linhaHifen);
                pessoa1.Pessoa();
            }else if (opcoes == 3) {
                System.out.print("Quilos a emagrecer: ");
                double quilos = scanner.nextDouble();
                pessoa1.emagracer(quilos);
                System.out.println(linhaHifen);
                pessoa1.Pessoa();
            }else if (opcoes == 4) {
                System.out.print("Tamanho a crescer: ");
                double altura = scanner.nextDouble();
                pessoa1.crescer(altura);
                System.out.println(linhaHifen);
                pessoa1.Pessoa();
            }else if (opcoes == 0) {
                break;
            }
        }
    }
}

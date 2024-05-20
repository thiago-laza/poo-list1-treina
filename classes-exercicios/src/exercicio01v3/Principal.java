package exercicio01v3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        Bola bola = new Bola();
        Scanner scanner = new Scanner(System.in);

        System.out.println(linhaHifen);

        System.out.print("Cor: ");
        bola.setCor(scanner.nextLine());
        System.out.print("Circunferencia: ");
        bola.setCircunferencia(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Material: ");
        bola.setMaterial(scanner.nextLine());

        System.err.println(linhaHifen);

        System.out.println("Cor: " + bola.getCor());
        System.out.println("Circunferencia: " + bola.getCircunferencia());
        System.out.println("Material: " + bola.getMaterial());

        System.out.println(linhaHifen);

        System.out.print("Mudar cor: ");
        String novaCor = scanner.nextLine();
        bola.mudaCor(novaCor);

        System.out.println(linhaHifen);

        System.out.println("Cor: " + bola.getCor());
        System.out.println("Circunferencia: " + bola.getCircunferencia());
        System.out.println("Material: " + bola.getMaterial());

        System.out.println(linhaHifen);
    }

}

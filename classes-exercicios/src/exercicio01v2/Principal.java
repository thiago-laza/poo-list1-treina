package exercicio01v2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Instanciando a classe Bola para obter o objeto bola
        Bola bola = new Bola();

        //Atribuindo valor aos atributos a partir das entradas do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cor: ");
        bola.cor = scanner.nextLine();
        System.out.print("Material: ");
        bola.material = scanner.nextLine();
        System.out.print("Circunferencia: ");
        bola.circunferencia = scanner.nextDouble();

        //Exibindo o "status" do objeto bola
        System.out.println("------------------------");
        System.out.println("Cor: " + bola.cor);
        System.out.println("Material: " + bola.material);
        System.out.println("Circunferencia: " + bola.circunferencia + " cm");

        //Aplicando o metodo mostraCor
        System.out.println("------------------------");
        String corAtual = bola.mostraCor();
        System.out.println(corAtual);
        System.out.println("------------------------");

        //Aplicando o metodo trocaCor
        System.out.print("Nova cor: ");
        String novaCor = scanner.nextLine();
        novaCor = scanner.nextLine();
        bola.mudaCor(novaCor);
        System.out.println("------------------------");
        System.out.println("Cor: " + bola.cor);
        System.out.println("Material: " + bola.material);
        System.out.println("Circunferencia: " + bola.circunferencia + " cm");
        System.out.println("------------------------");

    }
}

package exercicio03v2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Lado A: ");
        retangulo.setLadoA(scanner.nextDouble());
        System.out.print("Lado B: ");
        retangulo.setLadoB(scanner.nextDouble());

        retangulo.separador();
        retangulo.retornaValorLados(retangulo.getLadoA(),retangulo.getLadoB());
        retangulo.area(retangulo.getLadoA(), retangulo.getLadoB());
        retangulo.perimetro(retangulo.getLadoA(), retangulo.getLadoB());
        retangulo.separador();

        System.out.print("Deseja mudar o valor dos lados?[s/n] ");
        scanner.nextLine();
        String resposta = scanner.nextLine();
        
        if (resposta.equals("s")) {
            System.out.print("Novo lado A: ");
            double x = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Novo lado B: ");
            double y = scanner.nextDouble();
            scanner.nextLine();
            retangulo.mudarLados(x, y);

            retangulo.separador();
            retangulo.retornaValorLados(retangulo.getLadoA(),retangulo.getLadoB());
            retangulo.area(retangulo.getLadoA(), retangulo.getLadoB());
            retangulo.perimetro(retangulo.getLadoA(), retangulo.getLadoB());
            retangulo.separador();

        }

        System.out.println("Informe as dimensoes de uma regiao: ");
        System.out.print("Largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Comprimento: ");
        double comprimento = scanner.nextDouble();
        double areaRegiao = largura * comprimento;
        double quantidadePisos = areaRegiao / (retangulo.getLadoA() * retangulo.getLadoB());
        System.out.println("Quantidade de pisos: " + quantidadePisos);
    }

}

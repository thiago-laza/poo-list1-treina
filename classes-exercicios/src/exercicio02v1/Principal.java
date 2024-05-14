package exercicio02v1;

public class Principal {
    public static void main(String[] args){
        //Instanciando a classe Quadrado para obter o objeto quadrado
        Quadrado quadrado = new Quadrado();
        //Atribuindo valor aos atributos
        quadrado.lado = 2.5;
        //Aplicando o metodo valorLado
        System.out.println("Lado: " + quadrado.valorLado() + " cm");
        //Aplicando o metodo calculaAre
        System.out.println("Area: " + quadrado.calculaArea(quadrado.lado) + " cm²");
        //Aplicando o metodo mudaLado
        System.out.println("-------------------------------");
        quadrado.mudaLado(3);
        System.out.println("Lado: " + quadrado.valorLado() + " cm");
        System.out.println("Area: " + quadrado.calculaArea(quadrado.lado) + " cm²");
    }
}

package exercicio03v1;

public class Retangulo {
    //Atributos
    public double ladoA;
    public double ladoB;

    //Metodos
    public void  valorLados(double a, double b){
        ladoA = a;
        ladoB = b;
        System.out.println("Dimensoes: " + a +" cm X " + b + " cm");
    }

    public double calculaArea(){
        return ladoA * ladoB;
    }

    public double calculaPerimetro(){
        return 2*ladoA + 2*ladoB;
    }

    public void mudaValorLados(double x, double y){
        ladoA = x;
        ladoB = y;
    }
}

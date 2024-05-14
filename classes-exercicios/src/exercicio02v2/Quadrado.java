package exercicio02v2;

public class Quadrado {
    //Atributo
    public double lado;

    //Metodos
    public  double valorLado(){
        return lado;
    }

    public double calculaArea(double lado){
        return lado * lado;
    }

    public void mudaLado(double novoLado){
        lado = novoLado;
    }
}

package exercicio02v3;

public class Quadrado {
    private double lado;

    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    public double area(double lado){
        return this.lado * this.lado;
    }

    public double mudaLado(double lado){
        return this.lado =  lado;
    }

}

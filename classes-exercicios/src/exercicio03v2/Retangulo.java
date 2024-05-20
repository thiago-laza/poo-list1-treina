package exercicio03v2;

public class Retangulo {
    private double ladoA;
    private double ladoB;

    public double getLadoA(){
        return ladoA;
    }
    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }

    public double getLadoB(){
        return ladoB;
    }
    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }

    public void retornaValorLados(double ladoA, double ladoB){
        System.out.println("Dimensoes: " + ladoA + " X " + ladoB + " m");
    }

    public void area(double ladoA, double ladoB){
        System.out.println("Area: " + ladoA * ladoB + " m²");
    }

    public void perimetro(double ladoA, double ladoB){
        double perimetro = 2*ladoA + 2*ladoB;
        System.out.println("Perimetro: " + perimetro + " m"); 
    }

    public void mudarLados(double x, double y){
        this.ladoA = x;
        this.ladoB = y;
    }

    public void separador(){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        System.out.println(linhaHifen);
    }

    

}

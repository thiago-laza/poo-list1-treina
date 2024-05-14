package exercicio01v1;

public class Bola {
    //atributos
    public String cor;
    public  double circunferencia;
    public String material;

    //metodos
    public String mostraCor(){
        return cor;
    }
    public String mudaCor(String x){
        cor = x;
        return cor;
    }

}

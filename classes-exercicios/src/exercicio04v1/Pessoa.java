package exercicio04v1;

public class Pessoa {
    //Atributos
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    //Metodos
    public void envelhecer(){
        idade++;
        if (idade < 21){
            altura += 0.5;
        }
    }
    public double engordar(double valorPesoEngordar){
        return peso += valorPesoEngordar;
    }
    public double emagrecer(double valorPesoEmagrecer){
        return peso -= valorPesoEmagrecer;
    }
    public double crescer(double valorCrecer){
        return altura += valorCrecer;
    }
}

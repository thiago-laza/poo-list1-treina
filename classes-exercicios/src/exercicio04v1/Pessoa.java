package exercicio04v1;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public void Pessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

    
    public String getNome(){
        return this.nome;
    }
    public void  setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void  envelhecer(int anos){
        this.idade += anos;
        if (this.idade < 21) {
            this.altura += 0.5;
        }
    }

    public void engordar(double quilos){
        this.peso += quilos;
    }

    public void emagracer(double quilos){
        this.peso -= quilos;
    }

    public void crescer(double altura){
        this.altura += altura;
    }

    
}

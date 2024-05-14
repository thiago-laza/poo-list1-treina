package exercicio01v1;

public class Principal {
    public static void main(String[] args){
        //Instanciando a classe Bola para obter o objeto bola.
        Bola bola = new Bola();
        //Atribuindo valor aos atributos
        bola.cor = "verde";
        bola.material = "borracha";
        bola.circunferencia = 0.50;
        //Exibindo o "status" do objeto bola
        System.out.println("Cor: " + bola.cor);
        System.out.println("Material: " + bola.material);
        System.out.println("Circunferencia: " + bola.circunferencia + " cm");
        //Aplicando o metodo mostraCor
        System.out.println("------------------------");
        String corAtual = bola.mostraCor();
        System.out.println(corAtual);
        System.out.println("------------------------");
        //Aplicando o metodo trocaCor
        String novaCor = bola.mudaCor("preta");
        System.out.println(novaCor);
    }
}

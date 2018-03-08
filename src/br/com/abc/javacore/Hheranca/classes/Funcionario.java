package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco de inicializacao estatico funcionario");
    }
    {
        System.out.println("Bloco de inicializacao funcionario 1");
    }
    {
        System.out.println("Bloco de inicializacao funcionario 2");
    }

    public Funcionario(String nome){
        // super ou o this devem estar na primeira linha
        super(nome);
        System.out.println("Dentro do construtor de funcionario");

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){

        System.out.println("Eu "+ super.nome +" Recebi o pagamento de "+this.salario);
    }

    public void setSalario(double salario){ this.salario = salario; }
    public double getSalario(){ return salario; }
}

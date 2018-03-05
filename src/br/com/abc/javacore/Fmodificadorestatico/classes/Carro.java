package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240.0;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime(){

        System.out.println("-------------------------");
        System.out.println("Carro: "+this.nome);
        System.out.println("Velocidade Maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+ velocidadeLimite);
    }
    public void setNome (String nome){ this.nome=nome; }

    public void setVelocidadeMaxima(double velocidadeMaxima){ this.velocidadeMaxima = velocidadeMaxima; }

    public void setVelocidadeLimite(double velocidadeLimite) { this.velocidadeLimite = velocidadeLimite; }

    public String getNome(){ return this.nome; }

    public double getVelocidadeLimite() { return velocidadeLimite; }

    public double getVelocidadeMaxima(){ return velocidadeLimite;}
}

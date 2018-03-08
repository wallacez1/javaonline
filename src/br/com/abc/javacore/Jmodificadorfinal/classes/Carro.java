package br.com.abc.javacore.Jmodificadorfinal.classes;


public class Carro {
    /**
     *  1 - variavel definada como final obrigatoriamente deve ser inicilizadas
     *  // NOMENCLATURA MUDA CONSTANTES EM JAVA SAO ESCRITAS LETRA MAISCULA_NOMECOMPOSTO//
     *
     *
     // 2- static mantem o mesmo atributo para todos os objetos.
     */

    public static final double VELOCIDADE__FINAL = 250;
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", Velocidade final ='" +VELOCIDADE__FINAL  + '\'' +
                '}';
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    // metodo nao pode ser sobrescrito com final
    public final void imprime(){
        System.out.println("Imprimindo um carro: ");
    }


    public static double getVelocidade_final() {
        return VELOCIDADE__FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

package br.com.abc.javacore.Aintroducaoclasses.teste;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "gol";
        carro.placa = "QWTHJ";
        carro.velocidadeMaxima = 120;

        System.out.println(carro.velocidadeMaxima);
        System.out.println(carro.placa);
        System.out.println(carro.modelo);
    }
}

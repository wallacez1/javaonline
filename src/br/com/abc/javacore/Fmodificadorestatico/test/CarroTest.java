package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());

        Carro c1 = new Carro("bmw", 280);
        Carro c2 = new Carro("mercedes", 245);
        Carro c3 = new Carro("porsche", 300);

        Carro.setVelocidadeLimite(220);
        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}

package br.com.abc.javacore.Aintroducaoclasses.teste;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();

        joao.nome = "joao";
        joao.matricula = "1111";
        joao.idade= 15;

        System.out.println(joao.matricula);
        System.out.println(joao.nome);
        System.out.println(joao.idade);
    }

}

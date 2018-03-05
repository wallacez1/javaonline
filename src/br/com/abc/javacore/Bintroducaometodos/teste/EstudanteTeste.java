package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.Classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("wallace santos");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3.5, 9.5, 8, 2});

        estudante.printDadosAluno();
        estudante.imprimeMedia();

        System.out.println(estudante.getNome());

        System.out.println("Aprovado? : "+estudante.getAprovado());

    }
}

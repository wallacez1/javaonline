package br.com.abc.javacore.Isobrescrita.teste;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria da Gloria");
        p.setIdade(40);
        Pessoa p2 = new Pessoa();
        p2.setNome("Pedro");
        p2.setIdade(15);
        System.out.println(p);
        System.out.println(p2);
    }
}

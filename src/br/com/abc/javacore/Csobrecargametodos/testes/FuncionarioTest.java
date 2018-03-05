package br.com.abc.javacore.Csobrecargametodos.testes;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("wallace Santos", "111.999.555.7", 1500.00, "27.986.54");

        Funcionario func2 = new Funcionario(){};

        func.imprime();

    }
}

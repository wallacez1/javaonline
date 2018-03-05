package br.com.abc.javacore.Dsobrecargaconstrutores.teste;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estud1 = new Estudante("12214","Pedro",new double[]{5,7,9},"13/09/2006");

        estud1.imprime();
    }
}

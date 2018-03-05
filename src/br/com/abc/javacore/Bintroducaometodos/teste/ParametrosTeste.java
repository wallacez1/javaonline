package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.Classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 20;
        int num2 = 10;

        calc.alteraDoisNumeros(num1,num2);

        System.out.println("dentro teste");

        System.out.println("num1: "+num1);
        System.out.println("num1: "+num2);
    }
}

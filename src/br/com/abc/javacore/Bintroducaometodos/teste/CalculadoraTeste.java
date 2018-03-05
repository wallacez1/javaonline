package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.Classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();

        System.out.println("Continuar a execução");

        calc.subtraiDoisNumeros();

        System.out.println("Continuar a execução");

        calc.multiplicaDoisNumeros(5.89,6);

        System.out.println("Continuar a execução");

        calc.divideDoisNumeros(10,0);

        int []numeros ={1,2,3,4,5};
        calc.somaArray(numeros);
        System.out.println("Continuar a execução");
        calc.somaVarargs(1,2,3,4,5);



    }
}

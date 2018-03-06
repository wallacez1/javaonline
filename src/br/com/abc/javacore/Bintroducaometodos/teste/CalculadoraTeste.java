package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.Classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        // Calculadora calc = new Calculadora();

        Calculadora.somaDoisNumeros();

        System.out.println("Continuar a execução");

        Calculadora.subtraiDoisNumeros();

        System.out.println("Continuar a execução");

        Calculadora.multiplicaDoisNumeros(5.89,6);

        System.out.println("Continuar a execução");

        Calculadora.divideDoisNumeros(10,0);

        int []numeros ={1,2,3,4,5};
        Calculadora.somaArray(numeros);
        System.out.println("Continuar a execução");
        Calculadora.somaVarargs(1,2,3,4,5);



    }
}

package br.com.abc.javacore.Bintroducaometodos.Classes;

public class Calculadora {
    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public static void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);

    }

    public static void divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por zero");
    }

    public static void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("num1: " + num1);
        System.out.println("num1: " + num2);

    }

    public static void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarargs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

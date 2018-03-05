package br.com.abc.introdução.ControledeFluxo;

public class ControleFluxo1 {
    public static void main(String[] args){
        int idade = 17;
        float salario = 1000;
        String categoria;

        if(idade <= 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria ="Categoria Adulto";
        }
        System.out.println(categoria);
    }
}

package br.com.abc.introdução.ControledeFluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {

        double salario = 900;
        double totalImposto = 0;
        if(salario < 1000){
            totalImposto=salario *0.05;
        }else if(salario >= 1000 && salario < 2000){
            totalImposto=salario*0.10;
        }else if (salario >= 2000 && salario < 4000){
            totalImposto=salario*0.15;
        }else{
            totalImposto = salario * 0.2;
        }
        System.out.println("O total de imposto "+totalImposto);
    }
}

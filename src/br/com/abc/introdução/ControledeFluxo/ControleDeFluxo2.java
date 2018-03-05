package br.com.abc.introdução.ControledeFluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        String status;
        int idade =18;

        status = idade < 18 ? "não adulto" : "adulto" ;
        System.out.println(status);
    }
}

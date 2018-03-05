package br.com.abc.introdução.ControledeFluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        // Dado um valor total de um carro diga quantas parcelas posso fazer, nenhuma parcela pode ser menor que mil

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);

        }

    }

}


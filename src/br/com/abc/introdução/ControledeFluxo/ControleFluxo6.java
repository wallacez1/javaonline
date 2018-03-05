package br.com.abc.introdução.ControledeFluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        // Dado um valor total de um carro diga quantas parcelas posso fazer, nenhuma parcela pode ser menor que mil

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
            System.out.println("Codigo consumindo memoria");
        }
    }
}
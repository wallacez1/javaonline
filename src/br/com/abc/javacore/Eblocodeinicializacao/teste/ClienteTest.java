package br.com.abc.javacore.Eblocodeinicializacao.teste;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        System.out.println("\n Quantidade de Parcelas :");
        for(int parcelas : cliente1.getParcelas()){
            System.out.print(parcelas +" ");
            };
    }
}

package br.com.abc.javacore.Fmodificadorestatico.test;


import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("\nQuantidade de Parcelas :");
//        for(int parcelas : cliente1.getParcelas()){
//            System.out.print(parcelas +" ");
//            };
        System.out.println("tamanho "+Cliente.getParcelas().length);

    }
}

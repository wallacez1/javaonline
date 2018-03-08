package br.com.abc.javacore.Kenumeradores.teste;

import br.com.abc.javacore.Kenumeradores.classes.Cliente;
import br.com.abc.javacore.Kenumeradores.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 =new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.tipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getid());
        System.out.println(TipoCliente.PESSOA_FISICA.getid());
        System.out.println(c1);

    }
}

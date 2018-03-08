package br.com.abc.javacore.Hheranca.teste;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class herancaTeste {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("wallace santos da silva");
//        p1.setCpf("14872368754");
//
      Endereco end = new Endereco();
//        end.setBairro("vila sao sebastiao");
//        end.setRua("Rua porto Seguro");
//      p1.setEndereco(end);
       // p1.imprime();

        System.out.println("----------------------------------------");

        Funcionario f = new Funcionario("Augusto");
        f.setCpf("986647");
        f.setSalario(589.55);
        f.setEndereco(end);

      //  f.imprime();

    }
    /**
     * Herença e sequencia de inicilização
     *
     * 1 - Espaço de memoria é alocado para o objeto sendo construido ;
     * 2 - Cada um dos atributos do objeto é criado e inicializaddo com os valores default;
     * 3 - O construtor da superclasse é chamado;
     * 4 - A inicialização dos atributos via declaração e o codigo do bloco de inicialização da superclasse são
     * executados na ordem que aparecem
     * 5 - O código do construtor da superclasse é chamado
     * 6 - passo 4 para superclasse é executado;
     * 7 o codigo do construtor da classe é executado.
     */
}

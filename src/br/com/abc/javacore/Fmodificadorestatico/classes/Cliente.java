package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {

    // 0 - Bloco de inicialização é executado quando a jvm carregar a classe (é executado apenas 1 vez)
    // 1 - Alocado espaço na memoria para objeto criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado



    private static int[] parcelas ;

    static{
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i =1; i<=100;i++){
            parcelas[i -1] = i;
        }
    }

        public Cliente(){

            };


        public static int [] getParcelas() { return parcelas; }
    }


